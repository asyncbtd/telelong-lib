package by.asyncbtd.tll.meta;

import by.asyncbtd.tll.meta.exception.TelegramApiException;
import by.asyncbtd.tll.meta.methods.SendMessage;

public interface TelegramClient {

    void execute(SendMessage sendMessage) throws TelegramApiException;
}
