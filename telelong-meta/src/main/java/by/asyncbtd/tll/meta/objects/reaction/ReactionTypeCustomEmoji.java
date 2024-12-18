package by.asyncbtd.tll.meta.objects.reaction;

public class ReactionTypeCustomEmoji implements ReactionType {

    private String type;
    private String customEmojiId;

    public String getType() {
        return type;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public String toString() {
        return "ReactionTypeCustomEmoji(type=" + this.getType() +
                ", customEmojiId=" + this.getCustomEmojiId() + ")";
    }

    public ReactionTypeCustomEmoji() {
    }

    public ReactionTypeCustomEmoji(String type, String customEmojiId) {
        this.type = type;
        this.customEmojiId = customEmojiId;
    }
}
