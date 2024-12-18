package by.asyncbtd.tll.longpoling;

import by.asyncbtd.tll.meta.exception.TelegramApiException;
import by.asyncbtd.tll.meta.methods.GetUpdates;
import by.asyncbtd.tll.meta.objects.Update;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TelegramLongPollingApplication  {

    private static final String API_URL = "https://api.telegram.org/bot";
    private static final int GET_UPDATES_LIMIT = 100;
    private static final int GET_UPDATES_TIMEOUT = 50;

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final GetUpdates getUpdates = new GetUpdates();

    private final AtomicInteger lastReceivedUpdate = new AtomicInteger(0);
    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public void getUpdates(String botToken, List<String> allowedUpdates, LongPollingUpdateConsumer updatesConsumer) {
        executor.scheduleAtFixedRate(() -> {
            List<Update> updates = getUpdatesFromTelegram(botToken, allowedUpdates);

            if (!updates.isEmpty()) {
                updates.removeIf(x -> x.getUpdateId() <= lastReceivedUpdate.get());

                lastReceivedUpdate.set(updates.parallelStream()
                        .mapToInt(Update::getUpdateId)
                        .max()
                        .orElse( lastReceivedUpdate.get()));

                updatesConsumer.consume(updates);
            }
        }, 1, 1, TimeUnit.MICROSECONDS);
    }

    private List<Update> getUpdatesFromTelegram(String botToken, List<String> allowedUpdates) {
        getUpdates.setOffset(lastReceivedUpdate.get() + 1);
        getUpdates.setLimit(GET_UPDATES_LIMIT);
        getUpdates.setTimeout(GET_UPDATES_TIMEOUT);
        getUpdates.setAllowedUpdates(allowedUpdates);

        String json;

        try {
            json = objectMapper.writeValueAsString(getUpdates);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        try {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL + botToken + "/getUpdates"))
                    .method("GET", HttpRequest.BodyPublishers.ofString(json))
                    .header("Content-Type", "application/json")
                    .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ResponseList responseList = objectMapper.readValue(response.body(), ResponseList.class);
            return responseList.getResultUpdates();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
