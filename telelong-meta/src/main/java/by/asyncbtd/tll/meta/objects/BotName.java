package by.asyncbtd.tll.meta.objects;

public class BotName {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "BotName(name=" + this.getName() + ")";
    }

    public BotName() {
    }

    public BotName(String name) {
        this.name = name;
    }
}
