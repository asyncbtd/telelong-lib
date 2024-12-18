package by.asyncbtd.tll.meta.objects.background;

public class BackgroundTypeChatTheme implements BackgroundType {

    private String type;
    private String themeName;

    public String getType() {
        return type;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String toString() {
        return "BackgroundTypeChatTheme(type=" + this.getType() +
                ", themeName=" + this.getThemeName() + ")";
    }

    public BackgroundTypeChatTheme() {
    }

    public BackgroundTypeChatTheme(String type, String themeName) {
        this.type = type;
        this.themeName = themeName;
    }
}
