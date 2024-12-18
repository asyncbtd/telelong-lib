package by.asyncbtd.tll.meta.objects.message;

public class MessageOriginHiddenUser implements MessageOrigin {

    private String type;
    private Integer data;
    private String senderUserName;

    public String getType() {
        return type;
    }

    public Integer getData() {
        return data;
    }

    public String getSenderUserName() {
        return senderUserName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setSenderUserName(String senderUserName) {
        this.senderUserName = senderUserName;
    }

    public String toString() {
        return "MessageOriginHiddenUser(type=" + this.getType() +
                ", data=" + this.getData() +
                ", senderUserName=" + this.getSenderUserName() + ")";
    }

    public MessageOriginHiddenUser() {
    }

    public MessageOriginHiddenUser(String type, Integer data, String senderUserName) {
        this.type = type;
        this.data = data;
        this.senderUserName = senderUserName;
    }
}
