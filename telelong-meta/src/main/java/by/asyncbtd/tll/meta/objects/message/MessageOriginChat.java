package by.asyncbtd.tll.meta.objects.message;

import by.asyncbtd.tll.meta.objects.chat.Chat;

public class MessageOriginChat implements MessageOrigin {

    private String type;
    private Integer data;
    private Chat senderChat;
    private String authorSignature;

    public String getType() {
        return type;
    }

    public Integer getData() {
        return data;
    }

    public Chat getSenderChat() {
        return senderChat;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setSenderChat(Chat senderChat) {
        this.senderChat = senderChat;
    }

    public void setAuthor_signature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public String toString() {
        return "MessageOriginChat(type=" + this.getType() +
                ", data=" + this.getData() +
                ", senderChat=" + this.getSenderChat() +
                ", author_signature=" + this.authorSignature + ")";
    }

    public MessageOriginChat() {
    }

    public MessageOriginChat(String type, Integer data, Chat senderChat, String authorSignature) {
        this.type = type;
        this.data = data;
        this.senderChat = senderChat;
        this.authorSignature = authorSignature;
    }
}
