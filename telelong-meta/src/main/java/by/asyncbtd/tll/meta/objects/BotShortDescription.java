package by.asyncbtd.tll.meta.objects;

public class BotShortDescription {

    private String shortDescription;

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String toString() {
        return "BotShortDescription(shortDescription=" + this.getShortDescription() + ")";
    }

    public BotShortDescription() {
    }

    public BotShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
