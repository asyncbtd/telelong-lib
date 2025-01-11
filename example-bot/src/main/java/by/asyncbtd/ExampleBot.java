package by.asyncbtd;

import by.asyncbtd.tll.client.HttpTelegramClient;
import by.asyncbtd.tll.longpoling.LongPollingSingleThreadUpdateConsumer;
import by.asyncbtd.tll.meta.TelegramClient;
import by.asyncbtd.tll.meta.exception.TelegramApiException;
import by.asyncbtd.tll.meta.methods.EditMessageText;
import by.asyncbtd.tll.meta.methods.SendMessage;
import by.asyncbtd.tll.meta.objects.Update;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExampleBot implements LongPollingSingleThreadUpdateConsumer {

    private final TelegramClient telegramClient;

    public ExampleBot(String botToken) {
        telegramClient = new HttpTelegramClient(botToken);
    }

    @Override
    public void consume(Update update) {
        Long chatId = update.getMessage().getChatId();

        var startMessage = new SendMessage();
        startMessage.setChatId(chatId);
        startMessage.setText("Запускаем слоты...\n\uD83C\uDFB0 [ | | | ]");

        try {
            telegramClient.execute(startMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

        for (int i = 1; i <= 5; i++) {
            int slotId = update.getMessage().getMessageId() + 1;
            var slotRols = new EditMessageText();
            slotRols.setChatId(chatId);
            slotRols.setMessageId(slotId);
            slotRols.setText(
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                telegramClient.execute(slotRols);
            } catch (TelegramApiException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String random() {
        var slots = List.of("\uD83C\uDF52", "\uD83C\uDF4B", "\uD83C\uDF47", "\uD83D\uDD14", "\uD83D\uDC8E");
        var random = new Random();
        return slots.get(random.nextInt(slots.size()));
    }
}
