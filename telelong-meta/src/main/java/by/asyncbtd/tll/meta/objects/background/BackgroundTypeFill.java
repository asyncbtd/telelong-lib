package by.asyncbtd.tll.meta.objects.background;

public class BackgroundTypeFill implements BackgroundType {

    private String type;
    private BackgroundFill fill;
    private Integer darkThemeDimming;

    public String getType() {
        return type;
    }

    public BackgroundFill getFill() {
        return fill;
    }

    public Integer getDarkThemeDimming() {
        return darkThemeDimming;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFill(BackgroundFill fill) {
        this.fill = fill;
    }

    public void setDarkThemeDimming(Integer darkThemeDimming) {
        this.darkThemeDimming = darkThemeDimming;
    }

    public String toString() {
        return "BackgroundTypeFill(type=" + this.getType() +
                ", fill=" + this.getFill() +
                ", darkThemeDimming=" + this.getDarkThemeDimming() + ")";
    }

    public BackgroundTypeFill() {
    }

    public BackgroundTypeFill(String type, BackgroundFill fill, Integer darkThemeDimming) {
        this.type = type;
        this.fill = fill;
        this.darkThemeDimming = darkThemeDimming;
    }
}
