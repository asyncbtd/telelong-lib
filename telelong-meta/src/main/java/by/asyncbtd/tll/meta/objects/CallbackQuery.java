package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.objects.message.MaybeInaccessibleMessage;

public class CallbackQuery {

    private String id;
    private User from;
    private MaybeInaccessibleMessage message;
    private String inlineMessageId;
    private String chatInstance;
    private String data;
    private String gameShortName;

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public MaybeInaccessibleMessage getMessage() {
        return message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public String getData() {
        return data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setMessage(MaybeInaccessibleMessage message) {
        this.message = message;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public void setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
    }

    public String toString() {
        return "CallbackQuery(id=" + this.getId() +
                ", from=" + this.getFrom() +
                ", message=" + this.getMessage() +
                ", inlineMessageId=" + this.getInlineMessageId() +
                ", chatInstance=" + this.getChatInstance() +
                ", data=" + this.getData() +
                ", gameShortName=" + this.getGameShortName() + ")";
    }

    public CallbackQuery() {
    }

    public CallbackQuery(String id, User from, MaybeInaccessibleMessage message, String inlineMessageId, String chatInstance, String data, String gameShortName) {
        this.id = id;
        this.from = from;
        this.message = message;
        this.inlineMessageId = inlineMessageId;
        this.chatInstance = chatInstance;
        this.data = data;
        this.gameShortName = gameShortName;
    }
}
