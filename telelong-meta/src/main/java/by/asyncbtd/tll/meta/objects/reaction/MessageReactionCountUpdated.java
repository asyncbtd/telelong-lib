package by.asyncbtd.tll.meta.objects.reaction;

import by.asyncbtd.tll.meta.objects.chat.Chat;

import java.util.List;

public class MessageReactionCountUpdated {

    private Chat chat;
    private Integer messageId;
    private Integer date;
    private List<ReactionCount> reactions;

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public Integer getDate() {
        return date;
    }

    public List<ReactionCount> getReactions() {
        return reactions;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setReactions(List<ReactionCount> reactions) {
        this.reactions = reactions;
    }

    public String toString() {
        return "MessageReactionCountUpdated(chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", date=" + this.getDate() +
                ", reactions=" + this.getReactions() + ")";
    }

    public MessageReactionCountUpdated() {
    }

    public MessageReactionCountUpdated(Chat chat, Integer messageId, Integer date, List<ReactionCount> reactions) {
        this.chat = chat;
        this.messageId = messageId;
        this.date = date;
        this.reactions = reactions;
    }
}
