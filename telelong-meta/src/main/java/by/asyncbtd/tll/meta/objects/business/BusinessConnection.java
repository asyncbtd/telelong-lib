package by.asyncbtd.tll.meta.objects.business;

import by.asyncbtd.tll.meta.objects.User;

public class BusinessConnection {

    private String id;
    private User user;
    private Long userChatId;
    private Integer date;
    private Boolean canReply;
    private Boolean isEnabled;

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserChatId(Long userChatId) {
        this.userChatId = userChatId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String toString() {
        return "BusinessConnection(id=" + this.getId() +
                ", user=" + this.getUser() +
                ", userChatId=" + this.getUserChatId() +
                ", date=" + this.getDate() +
                ", canReply" + this.getCanReply() +
                ", isEnable" + this.getIsEnabled() + ")";
    }

    public BusinessConnection() {
    }

    public BusinessConnection(String id, User user, Long userChatId, Integer date, Boolean canReply, Boolean isEnabled) {
        this.id = id;
        this.user = user;
        this.userChatId = userChatId;
        this.date = date;
        this.canReply = canReply;
        this.isEnabled = isEnabled;
    }
}
