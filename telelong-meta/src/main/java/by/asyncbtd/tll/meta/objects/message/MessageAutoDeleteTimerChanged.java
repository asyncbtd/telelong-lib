package by.asyncbtd.tll.meta.objects.message;

public class MessageAutoDeleteTimerChanged {

    private Integer messageAutoDeleteTime;

    public Integer getMessageAutoDeleteTime() {
        return messageAutoDeleteTime;
    }

    public void setMessageAutoDeleteTime(Integer messageAutoDeleteTime) {
        this.messageAutoDeleteTime = messageAutoDeleteTime;
    }

    public String toString() {
        return "MessageAutoDeleteTimerChanged(messageAutoDeleteTime=" + this.getMessageAutoDeleteTime() +")";
    }

    public MessageAutoDeleteTimerChanged() {
    }

    public MessageAutoDeleteTimerChanged(Integer messageAutoDeleteTime) {
        this.messageAutoDeleteTime = messageAutoDeleteTime;
    }
}
