package by.asyncbtd.tll.meta.objects.chat.boost;

import by.asyncbtd.tll.meta.objects.chat.Chat;

public class ChatBoostUpdated {

    private Chat chat;
    private ChatBoost boost;

    public Chat getChat() {
        return chat;
    }

    public ChatBoost getBoost() {
        return boost;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setBoost(ChatBoost boost) {
        this.boost = boost;
    }

    public String toString() {
        return "ChatBoostUpdated(chat=" + this.getChat() +
                ", boost=" + this.getBoost() + ")";
    }

    public ChatBoostUpdated() {
    }

    public ChatBoostUpdated(Chat chat, ChatBoost boost) {
        this.chat = chat;
        this.boost = boost;
    }
}
