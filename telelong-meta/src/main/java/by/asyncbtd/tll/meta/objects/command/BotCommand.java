package by.asyncbtd.tll.meta.objects.command;

public class BotCommand {

    private String command;
    private String description;

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "BotCommand(command=" + this.getCommand() +
                ", description=" + this.getDescription() + ")";
    }

    public BotCommand() {
    }

    public BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }
}
