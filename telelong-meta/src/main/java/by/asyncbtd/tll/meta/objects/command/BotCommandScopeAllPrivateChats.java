package by.asyncbtd.tll.meta.objects.command;

public class BotCommandScopeAllPrivateChats implements BotCommandScope {

    private final String type = "all_private_chats";

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "BotCommandScopeDefault(type=" + this.getType() + ")";
    }

    public BotCommandScopeAllPrivateChats() {
    }
}
