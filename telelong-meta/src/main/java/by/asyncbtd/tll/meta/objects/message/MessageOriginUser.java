package by.asyncbtd.tll.meta.objects.message;

import by.asyncbtd.tll.meta.objects.User;

public class MessageOriginUser implements MessageOrigin {

    private String type;
    private Integer date;
    private User senderUser;

    public String getType() {
        return type;
    }

    public Integer getDate() {
        return date;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setSenderUser(User senderUser) {
        this.senderUser = senderUser;
    }

    @Override
    public String toString() {
        return "MessageOriginUser(type=" + this.getType() +
                ", date=" + this.getDate()+
                ", senderUser=" + this.getSenderUser() + ")";
    }

    public MessageOriginUser() {
    }

    public MessageOriginUser(String type, Integer date, User senderUser) {
        this.type = type;
        this.date = date;
        this.senderUser = senderUser;
    }
}
