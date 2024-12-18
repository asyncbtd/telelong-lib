package by.asyncbtd;

import by.asyncbtd.tll.longpoling.TelegramLongPollingApplication;

import java.util.List;

public class Main {

    private static final String botToken = "";
    private static final TelegramLongPollingApplication botsApplication = new TelegramLongPollingApplication();

    public static void main(String[] args) {
        var allowedUpdates = List.of("message_reaction","message");

        botsApplication.getUpdates(botToken, allowedUpdates, new ExampleBot(botToken));
    }
}
