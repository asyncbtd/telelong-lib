package by.asyncbtd.tll.meta.objects.message;

import by.asyncbtd.tll.meta.objects.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageEntity {

    @JsonProperty("type")
    private String type;

    @JsonProperty("offset")
    private Integer offset;

    @JsonProperty("length")
    private Integer length;

    @JsonProperty("url")
    private String url;

    @JsonProperty("user")
    private User user;

    @JsonProperty("language")
    private String language;

    @JsonProperty("custom_emoji_id")
    private String customEmojiId;

    public String getType() {
        return type;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLength() {
        return length;
    }

    public String getUrl() {
        return url;
    }

    public User getUser() {
        return user;
    }

    public String getLanguage() {
        return language;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public String toString() {
        return "MessageEntity(type=" + this.getType() +
                ", offset=" + this.getOffset() +
                ", length=" + this.getLength() +
                ", url=" + this.getUrl() +
                ", user=" + this.getUser() +
                ", language=" + this.getLanguage() +
                ", customEmojiId=" + this.getCustomEmojiId() + ")";
    }

    public MessageEntity() {
    }

    public MessageEntity(String type, Integer offset, Integer length, String url, User user, String language, String customEmojiId) {
        this.type = type;
        this.offset = offset;
        this.length = length;
        this.url = url;
        this.user = user;
        this.language = language;
        this.customEmojiId = customEmojiId;
    }
}
