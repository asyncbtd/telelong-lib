package by.asyncbtd.tll.meta.objects.background;

public class ChatBackground {

    private BackgroundType type;

    public BackgroundType getType() {
        return type;
    }

    public void setType(BackgroundType type) {
        this.type = type;
    }

    public String toString() {
        return "ChatBackground(type=" + this.getType() + ")";
    }

    public ChatBackground() {
    }

    public ChatBackground(BackgroundType type) {
        this.type = type;
    }
}
