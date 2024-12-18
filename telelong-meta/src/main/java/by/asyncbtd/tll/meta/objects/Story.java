package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.objects.chat.Chat;

public class Story {

    private Chat chat;
    private Long id;

    public Chat getChat() {
        return chat;
    }

    public Long getId() {
        return id;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        return "Story(chat=" + this.getChat() +
                ", id=" + this.getId() + ")";
    }

    public Story() {
    }

    public Story(Chat chat, Long id) {
        this.chat = chat;
        this.id = id;
    }
}
