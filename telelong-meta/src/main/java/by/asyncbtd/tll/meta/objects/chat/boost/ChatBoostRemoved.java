package by.asyncbtd.tll.meta.objects.chat.boost;

import by.asyncbtd.tll.meta.objects.chat.Chat;

public class ChatBoostRemoved {

    private Chat chat;
    private String boostId;
    private Integer remove_date;
    private ChatBoostSource source;

    public Chat getChat() {
        return chat;
    }

    public String getBoostId() {
        return boostId;
    }

    public Integer getRemove_date() {
        return remove_date;
    }

    public ChatBoostSource getSource() {
        return source;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setBoostId(String boostId) {
        this.boostId = boostId;
    }

    public void setRemove_date(Integer remove_date) {
        this.remove_date = remove_date;
    }

    public void setSource(ChatBoostSource source) {
        this.source = source;
    }

    public String toString() {
        return "ChatBoostRemoved(chat=" + this.getChat() +
                ", boostId=" + this.getBoostId() +
                ", remove_date=" + this.getRemove_date() +
                ", source=" + this.getSource() + ")";
    }

    public ChatBoostRemoved() {
    }

    public ChatBoostRemoved(Chat chat, String boostId, Integer remove_date, ChatBoostSource source) {
        this.chat = chat;
        this.boostId = boostId;
        this.remove_date = remove_date;
        this.source = source;
    }
}
