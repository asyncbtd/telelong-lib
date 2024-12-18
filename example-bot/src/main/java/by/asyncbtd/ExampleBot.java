package by.asyncbtd;

import by.asyncbtd.tll.client.HttpTelegramClient;
import by.asyncbtd.tll.longpoling.LongPollingSingleThreadUpdateConsumer;
import by.asyncbtd.tll.meta.TelegramClient;
import by.asyncbtd.tll.meta.exception.TelegramApiException;
import by.asyncbtd.tll.meta.methods.SendMessage;
import by.asyncbtd.tll.meta.objects.Update;

public class ExampleBot implements LongPollingSingleThreadUpdateConsumer {

    private final TelegramClient telegramClient;

    public ExampleBot(String botToken) {
        telegramClient = new HttpTelegramClient(botToken);
    }

    @Override
    public void consume(Update update) {
        System.out.printf(update.getUpdateId().toString() + "\n");
        System.out.printf(update.getMessage().getText() + "\n");

        Long chatId = update.getMessage().getChatId();
        String message = update.getMessage().getText();

        var sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(message);

        try {
            telegramClient.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }
}
