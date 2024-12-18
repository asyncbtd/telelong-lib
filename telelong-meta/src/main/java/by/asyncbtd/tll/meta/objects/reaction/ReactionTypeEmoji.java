package by.asyncbtd.tll.meta.objects.reaction;

public class ReactionTypeEmoji implements ReactionType {

    private String type;
    private String emoji;

    public String getType() {
        return type;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String toString() {
        return "ReactionType(type=" + this.getType() +
                ", emoji=" + this.getEmoji() + ")";
    }

    public ReactionTypeEmoji() {
    }

    public ReactionTypeEmoji(String type, String emoji) {
        this.type = type;
        this.emoji = emoji;
    }
}
