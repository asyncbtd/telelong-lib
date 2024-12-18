package by.asyncbtd.tll.meta.objects.message;

public class MessageId {

    private Integer messageId;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String toString() {
        return "MessageId(messageId=" + this.getMessageId() + ")";
    }

    public MessageId() {
    }

    public MessageId(Integer messageId) {
        this.messageId = messageId;
    }
}
