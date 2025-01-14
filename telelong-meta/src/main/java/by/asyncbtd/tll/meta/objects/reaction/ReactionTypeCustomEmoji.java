package by.asyncbtd.tll.meta.objects.reaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReactionTypeCustomEmoji implements ReactionType {

    @JsonProperty("type")
    private String type;

    @JsonProperty("custom_emoji_id")
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
