package by.asyncbtd.tll.meta.objects;

public class BotDescription {

    private String description;

    public String getName() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "BotName(description=" + this.getName() + ")";
    }

    public BotDescription() {
    }

    public BotDescription(String description) {
        this.description = description;
    }
}
