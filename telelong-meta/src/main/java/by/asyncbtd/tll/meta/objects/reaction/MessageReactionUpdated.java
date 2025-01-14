package by.asyncbtd.tll.meta.objects.reaction;

import by.asyncbtd.tll.meta.objects.User;
import by.asyncbtd.tll.meta.objects.chat.Chat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageReactionUpdated {

    @JsonProperty("chat")
    private Chat chat;

    @JsonProperty("message_id")
    private Integer messageId;

    @JsonProperty("user")
    private User user;

    @JsonProperty("actor_chat")
    private Chat actorChat;

    @JsonProperty("date")
    private Integer date;

    @JsonProperty("old_reaction")
    private List<ReactionType> oldReaction;

    @JsonProperty("new_reaction")
    private List<ReactionType> newReaction;

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public User getUser() {
        return user;
    }

    public Chat getActorChat() {
        return actorChat;
    }

    public Integer getDate() {
        return date;
    }

    public List<ReactionType> getOldReaction() {
        return oldReaction;
    }

    public List<ReactionType> getNewReaction() {
        return newReaction;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setActorChat(Chat actorChat) {
        this.actorChat = actorChat;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setOldReaction(List<ReactionType> oldReaction) {
        this.oldReaction = oldReaction;
    }

    public void setNewReaction(List<ReactionType> newReaction) {
        this.newReaction = newReaction;
    }

    public String toString() {
        return "MessageReactionUpdated(chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", user=" + this.getUser() +
                ", actorChat=" + this.getActorChat() +
                ", date=" + this.getDate() +
                ", oldReaction=" + this.getOldReaction() +
                ", newReaction=" + this.getNewReaction() + ")";
    }

    public MessageReactionUpdated() {
    }

    public MessageReactionUpdated(Chat chat, Integer messageId, User user, Chat actorChat, Integer date, List<ReactionType> oldReaction, List<ReactionType> newReaction) {
        this.chat = chat;
        this.messageId = messageId;
        this.user = user;
        this.actorChat = actorChat;
        this.date = date;
        this.oldReaction = oldReaction;
        this.newReaction = newReaction;
    }
}
