package by.asyncbtd.tll.client;

import by.asyncbtd.tll.meta.TelegramClient;
import by.asyncbtd.tll.meta.methods.SendMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpTelegramClient implements TelegramClient {

    private final static String API_URL = "https://api.telegram.org/bot";
    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final String botToken;
    private final ObjectMapper objectMapper = new ObjectMapper();

    private void sendToApi(String json, String method) {
        var request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + botToken + method))
                .method("POST", HttpRequest.BodyPublishers.ofString(json))
                .header("Content-Type", "application/json")
                .build();
        try {
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void execute(SendMessage sendMessage) {
        String method = "/sendMessage";
        String json;
        try {
            json = objectMapper.writeValueAsString(sendMessage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sendToApi(json, method);
    }

    public HttpTelegramClient(String botToken) {
        this.botToken = botToken;
    }
}
