package by.asyncbtd.tll.meta.objects.chat.member;

import by.asyncbtd.tll.meta.objects.User;

public class ChatMemberOwner implements ChatMember {

    private String status;
    private User user;
    private Boolean isAnonymous;
    private String customTitle;

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    public String toString() {
        return "ChatMemberOwner(status=" + this.getStatus() +
                ", user=" + this.getUser() +
                ", isAnonymous=" + this.getIsAnonymous() +
                ", customTitle=" + this.getCustomTitle() + ")";
    }

    public ChatMemberOwner() {
    }

    public ChatMemberOwner(String status, User user, Boolean isAnonymous, String customTitle) {
        this.status = status;
        this.user = user;
        this.isAnonymous = isAnonymous;
        this.customTitle = customTitle;
    }
}
