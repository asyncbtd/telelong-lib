package by.asyncbtd.tll.client;

import by.asyncbtd.tll.meta.TelegramClient;
import by.asyncbtd.tll.meta.methods.EditMessageText;
import by.asyncbtd.tll.meta.methods.SendDice;
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
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            response.body();

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
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

    @Override
    public void execute(SendDice sendDice) {
        String method = "/sendDice";
        String json;
        try {
            json = objectMapper.writeValueAsString(sendDice);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sendToApi(json, method);
    }

    @Override
    public void execute(EditMessageText editMessageText) {
        String method = "/editMessageText";
        String json;
        try {
            json = objectMapper.writeValueAsString(editMessageText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sendToApi(json, method);
    }


    public HttpTelegramClient(String botToken) {
        this.botToken = botToken;
    }
}
