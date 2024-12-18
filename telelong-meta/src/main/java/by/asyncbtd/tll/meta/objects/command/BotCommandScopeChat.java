package by.asyncbtd.tll.meta.objects.command;

public class BotCommandScopeChat implements BotCommandScope {

    private final String type = "chat";
    private String chatId;

    public String getType() {
        return this.type;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String toString() {
        return "BotCommandScopeChat(type=" + this.getType() +
                ", chatId=" + this.getChatId() + ")";
    }

    public BotCommandScopeChat() {
    }

    public BotCommandScopeChat(String chatId) {
        this.chatId = chatId;
    }
}
