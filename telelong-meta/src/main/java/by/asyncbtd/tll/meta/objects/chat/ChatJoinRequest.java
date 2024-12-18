package by.asyncbtd.tll.meta.objects.chat;

import by.asyncbtd.tll.meta.objects.User;

public class ChatJoinRequest {

    private Chat chat;
    private User from;
    private Long userChatId;
    private Integer date;
    private String bio;
    private ChatInviteLink inviteLink;

    public Chat getChat() {
        return chat;
    }

    public User getFrom() {
        return from;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public String getBio() {
        return bio;
    }

    public ChatInviteLink getInviteLink() {
        return inviteLink;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setUserChatId(Long userChatId) {
        this.userChatId = userChatId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setInviteLink(ChatInviteLink inviteLink) {
        this.inviteLink = inviteLink;
    }

    public String toString() {
        return "ChatJoinRequest(chat=" + this.getChat() +
                ", from=" + this.getFrom() +
                ", userChatId=" + this.getUserChatId() +
                ", date=" + this.getDate() +
                ", bio=" + this.getBio() +
                ", inviteLink=" + this.getInviteLink() + ")";
    }

    public ChatJoinRequest() {
    }

    public ChatJoinRequest(Chat chat, User from, Long userChatId, Integer date, String bio, ChatInviteLink inviteLink) {
        this.chat = chat;
        this.from = from;
        this.userChatId = userChatId;
        this.date = date;
        this.bio = bio;
        this.inviteLink = inviteLink;
    }
}
