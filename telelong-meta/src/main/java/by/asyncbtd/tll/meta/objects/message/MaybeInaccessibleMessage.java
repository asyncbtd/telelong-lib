package by.asyncbtd.tll.meta.objects.message;

public interface MaybeInaccessibleMessage {
    String DATE_FIELD = "date";

    default boolean isUserMessage() {
        return true;
    }

    default boolean isGroupMessage() {
        return false;
    }

    default boolean isSuperGroupMessage() {
        return false;
    }

    Long getChatId();

    Integer getMessageId();

    Integer getDate();
}
