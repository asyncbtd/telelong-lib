package by.asyncbtd.tll.meta.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SwitchInlineQueryChosenChat {

    @JsonProperty("query")
    private String query;

    @JsonProperty("allow_user_chats")
    private Boolean allowUserChats;

    @JsonProperty("allow_bot_chats")
    private Boolean allowBotChat;

    @JsonProperty("allow_group_chats")
    private Boolean allowGroupChats;

    @JsonProperty("allow_channel_chats")
    private Boolean allowChannelChats;

    public String getQuery() {
        return query;
    }

    public Boolean getAllowUserChats() {
        return allowUserChats;
    }

    public Boolean getAllowBotChat() {
        return allowBotChat;
    }

    public Boolean getAllowGroupChats() {
        return allowGroupChats;
    }

    public Boolean getAllowChannelChats() {
        return allowChannelChats;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setAllowUserChats(Boolean allowUserChats) {
        this.allowUserChats = allowUserChats;
    }

    public void setAllowBotChat(Boolean allowBotChat) {
        this.allowBotChat = allowBotChat;
    }

    public void setAllowGroupChats(Boolean allowGroupChats) {
        this.allowGroupChats = allowGroupChats;
    }

    public void setAllowChannelChats(Boolean allowChannelChats) {
        this.allowChannelChats = allowChannelChats;
    }

    public String toString() {
        return "SwitchInlineQueryChosenChat(query=" + this.getQuery() +
                ", allowUserChats=" + this.getAllowUserChats() +
                ", allowBotChat=" + this.getAllowBotChat() +
                ", allowGroupChats=" + this.getAllowGroupChats() +
                ", allowChannelChats=" + this.getAllowChannelChats() + ")";
    }

    public SwitchInlineQueryChosenChat() {
    }

    public SwitchInlineQueryChosenChat(String query, Boolean allowUserChats, Boolean allowBotChat, Boolean allowGroupChats, Boolean allowChannelChats) {
        this.query = query;
        this.allowUserChats = allowUserChats;
        this.allowBotChat = allowBotChat;
        this.allowGroupChats = allowGroupChats;
        this.allowChannelChats = allowChannelChats;
    }
}
