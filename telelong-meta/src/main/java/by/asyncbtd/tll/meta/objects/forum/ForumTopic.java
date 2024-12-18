package by.asyncbtd.tll.meta.objects.forum;

public class ForumTopic {

    private Integer messageThreadId;
    private String name;
    private Integer iconColor;
    private String iconCustomEmojiId;

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public String getName() {
        return name;
    }

    public Integer getIconColor() {
        return iconColor;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }

    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIconColor(Integer iconColor) {
        this.iconColor = iconColor;
    }

    public void setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public String toString() {
        return "ForumTopic(messageThreadId=" + this.getMessageThreadId() +
                ", name=" + this.getName() +
                ", iconColor=" + this.getIconColor() +
                ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public ForumTopic() {
    }

    public ForumTopic(Integer messageThreadId, String name, Integer iconColor, String iconCustomEmojiId) {
        this.messageThreadId = messageThreadId;
        this.name = name;
        this.iconColor = iconColor;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }
}
