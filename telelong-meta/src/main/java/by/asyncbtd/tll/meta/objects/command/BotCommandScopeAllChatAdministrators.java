package by.asyncbtd.tll.meta.objects.command;

public class BotCommandScopeAllChatAdministrators implements BotCommandScope {

    private final String type = "all_chat_administrators";

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "BotCommandScopeDefault(type=" + this.getType() + ")";
    }

    public BotCommandScopeAllChatAdministrators() {
    }
}
