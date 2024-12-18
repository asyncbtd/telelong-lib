package by.asyncbtd.tll.meta.objects.chat.member;

import by.asyncbtd.tll.meta.objects.User;

public class ChatMemberMember implements ChatMember {

    private String status;
    private User user;
    private Integer untilDate;

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }

    public String toString() {
        return "ChatMemberMember(status=" + this.getStatus() +
                ", user=" + this.getUser() +
                ", untilDate=" + this.getUntilDate() + ")";
    }

    public ChatMemberMember() {
    }

    public ChatMemberMember(String status, User user, Integer untilDate) {
        this.status = status;
        this.user = user;
        this.untilDate = untilDate;
    }
}