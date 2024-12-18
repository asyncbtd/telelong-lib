package by.asyncbtd.tll.meta.objects.chat;

import by.asyncbtd.tll.meta.objects.PhotoSize;

import java.util.List;

public class ChatShared {

    private Integer requestId;
    private Long chatId;
    private String title;
    private String username;
    private List<PhotoSize> photo;

    public Integer getRequestId() {
        return requestId;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String toString() {
        return "ChatShared(requestId=" + this.getRequestId() +
                ", chatId=" + this.getChatId() +
                ", title=" + this.getTitle() +
                ", username=" + this.getUsername() +
                ", photo=" + this.getPhoto() + ")";
    }

    public ChatShared() {
    }

    public ChatShared(Integer requestId, Long chatId, String title, String username, List<PhotoSize> photo) {
        this.requestId = requestId;
        this.chatId = chatId;
        this.title = title;
        this.username = username;
        this.photo = photo;
    }
}
