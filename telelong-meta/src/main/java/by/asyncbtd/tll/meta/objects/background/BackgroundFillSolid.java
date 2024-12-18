package by.asyncbtd.tll.meta.objects.background;

public class BackgroundFillSolid implements BackgroundFill {

    private String type;
    private Integer color;

    public String getType() {
        return type;
    }

    public Integer getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String toString() {
        return "BackgroundFillSolid(type=" + this.getType() +
                ", color=" + this.getColor() + ")";
    }

    public BackgroundFillSolid() {
    }

    public BackgroundFillSolid(String type, Integer color) {
        this.type = type;
        this.color = color;
    }
}
