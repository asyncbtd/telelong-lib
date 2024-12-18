package by.asyncbtd.tll.meta.objects.forum;

public class ForumTopicCreated {

    private String name;
    private Integer iconColor;
    private String iconCustomEmojiId;

    public String getName() {
        return name;
    }

    public Integer getIconColor() {
        return iconColor;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
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
        return "ForumTopicCreated(name=" + this.getName() +
                ", iconColor=" + this.getIconColor() +
                ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public ForumTopicCreated() {
    }

    public ForumTopicCreated(String name, Integer iconColor, String iconCustomEmojiId) {
        this.name = name;
        this.iconColor = iconColor;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }
}
