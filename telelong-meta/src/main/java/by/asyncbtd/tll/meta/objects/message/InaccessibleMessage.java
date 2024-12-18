package by.asyncbtd.tll.meta.objects.message;

import by.asyncbtd.tll.meta.objects.chat.Chat;

public class InaccessibleMessage implements MaybeInaccessibleMessage {

    private Chat chat;
    private Integer messageId;
    private Integer date;

    public Long getChatId() {
        return chat.getId();
    }

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public Integer getDate() {
        return date;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String toString() {
        return "InaccessibleMessage(chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", date=" + this.getDate() + ")";
    }

    public InaccessibleMessage() {
    }

    public InaccessibleMessage(Chat chat, Integer messageId, Integer date) {
        this.chat = chat;
        this.messageId = messageId;
        this.date = date;
    }
}
