package by.asyncbtd.tll.meta;

import by.asyncbtd.tll.meta.exception.TelegramApiException;
import by.asyncbtd.tll.meta.methods.EditMessageText;
import by.asyncbtd.tll.meta.methods.SendDice;
import by.asyncbtd.tll.meta.methods.SendMessage;

public interface TelegramClient {

    void execute(SendMessage sendMessage) throws TelegramApiException;
    void execute(SendDice sendDice) throws TelegramApiException;
    void execute(EditMessageText editMessageText) throws TelegramApiException;
}
