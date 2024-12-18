package by.asyncbtd.tll.meta.objects.menu;

public class MenuButtonCommands implements MenuButton {

    private final String type = "commands";

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "MenuButtonCommands(type=" + this.getType() + ")";
    }

    public MenuButtonCommands() {
    }
}
