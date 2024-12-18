package by.asyncbtd.tll.meta.objects.command;

public class BotCommandScopeAllGroupChats implements BotCommandScope {

    private final String type = "all_group_chats";

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "BotCommandScopeDefault(type=" + this.getType() + ")";
    }

    public BotCommandScopeAllGroupChats() {
    }
}
