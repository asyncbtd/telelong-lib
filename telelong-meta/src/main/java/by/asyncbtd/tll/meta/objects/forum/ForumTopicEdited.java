package by.asyncbtd.tll.meta.objects.forum;

public class ForumTopicEdited {

    private String name;
    private String iconCustomEmojiId;

    public String getName() {
        return name;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public String toString() {
        return "ForumTopicEdited(name=" + this.getName() +
                ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public ForumTopicEdited() {
    }

    public ForumTopicEdited(String name, String iconCustomEmojiId) {
        this.name = name;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }
}
