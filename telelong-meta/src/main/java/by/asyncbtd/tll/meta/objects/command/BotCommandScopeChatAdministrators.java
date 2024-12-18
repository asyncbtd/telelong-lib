package by.asyncbtd.tll.meta.objects.command;

public class BotCommandScopeChatAdministrators implements BotCommandScope {

    private final String type = "chat_administrators";
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

    public BotCommandScopeChatAdministrators() {
    }

    public BotCommandScopeChatAdministrators(String chatId) {
        this.chatId = chatId;
    }
}
