package by.asyncbtd.tll.meta.objects.message;

import by.asyncbtd.tll.meta.objects.chat.Chat;

public class MessageOriginChannel implements MessageOrigin {

    private String type;
    private Integer date;
    private Chat chat;
    private Long messageId;
    private String authorSignature;

    public String getType() {
        return type;
    }

    public Integer getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public Long getMessageId() {
        return messageId;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public String toString() {
        return "MessageOriginChannel(type=" + this.getType() +
                ", date=" + this.getDate() +
                ", chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", authorSignature=" + this.getAuthorSignature() + ")";
    }

    public MessageOriginChannel() {
    }

    public MessageOriginChannel(String type, Integer date, Chat chat, Long messageId, String authorSignature) {
        this.type = type;
        this.date = date;
        this.chat = chat;
        this.messageId = messageId;
        this.authorSignature = authorSignature;
    }
}
