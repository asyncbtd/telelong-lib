package by.asyncbtd.tll.meta.objects.command;

public class BotCommandScopeDefault implements BotCommandScope {

    private final String type = "default";

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "BotCommandScopeDefault(type=" + this.getType() + ")";
    }

    public BotCommandScopeDefault() {
    }
}
