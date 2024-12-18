package by.asyncbtd.tll.meta.objects.chat.member;

import by.asyncbtd.tll.meta.objects.User;

public class ChatMemberBanned implements ChatMember {

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
        return "ChatMemberBanned(status=" + this.getStatus() +
                ", user=" + this.getUser() +
                ", untilDate=" + this.getUntilDate() + ")";
    }

    public ChatMemberBanned() {
    }

    public ChatMemberBanned(String status, User user, Integer untilDate) {
        this.status = status;
        this.user = user;
        this.untilDate = untilDate;
    }
}
