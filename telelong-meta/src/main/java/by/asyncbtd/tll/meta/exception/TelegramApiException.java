package by.asyncbtd.tll.meta.exception;

public class TelegramApiException extends Exception {

    public TelegramApiException() {
        super();
    }

    public TelegramApiException(String message) {
        super(message);
    }

    public TelegramApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public TelegramApiException(Throwable cause) {
        super(cause);
    }
}
