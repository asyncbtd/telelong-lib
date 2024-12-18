package by.asyncbtd.tll.meta.objects.background;

public class BackgroundFillGradient implements BackgroundFill {

    private String type;
    private Integer topColor;
    private Integer bottomColor;
    private Integer rotationAngle;

    public String getType() {
        return type;
    }

    public Integer getTopColor() {
        return topColor;
    }

    public Integer getBottomColor() {
        return bottomColor;
    }

    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTopColor(Integer topColor) {
        this.topColor = topColor;
    }

    public void setBottomColor(Integer bottomColor) {
        this.bottomColor = bottomColor;
    }

    public void setRotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    public String toString() {
        return "BackgroundFillGradient(type=" + this.getType() +
                ", topColor=" + this.getTopColor() +
                ", bottomColor=" + this.getBottomColor() +
                ", rotationAngle=" + this.getRotationAngle() + ")";
    }

    public BackgroundFillGradient() {
    }

    public BackgroundFillGradient(String type, Integer topColor, Integer bottomColor, Integer rotationAngle) {
        this.type = type;
        this.topColor = topColor;
        this.bottomColor = bottomColor;
        this.rotationAngle = rotationAngle;
    }
}
