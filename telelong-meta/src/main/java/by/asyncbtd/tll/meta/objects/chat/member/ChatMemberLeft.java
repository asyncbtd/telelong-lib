package by.asyncbtd.tll.meta.objects.chat.member;

import by.asyncbtd.tll.meta.objects.User;

public class ChatMemberLeft implements ChatMember {

    private String status;
    private User user;

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "ChatMemberLeft(status=" + this.getStatus() +
                ", user=" + this.getUser() + ")";
    }

    public ChatMemberLeft() {
    }

    public ChatMemberLeft(String status, User user) {
        this.status = status;
        this.user = user;
    }
}
