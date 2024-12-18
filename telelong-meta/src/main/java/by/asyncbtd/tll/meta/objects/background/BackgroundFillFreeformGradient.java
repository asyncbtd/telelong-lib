package by.asyncbtd.tll.meta.objects.background;

import java.util.List;

public class BackgroundFillFreeformGradient implements BackgroundFill {

    private String type;
    private List<Integer> color;

    public String getType() {
        return type;
    }

    public List<Integer> getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(List<Integer> color) {
        this.color = color;
    }

    public String toString() {
        return "BackgroundFillFreeformGradient(type=" + this.getType() +
                ", color=" + this.getColor() + ")";
    }

    public BackgroundFillFreeformGradient() {
    }

    public BackgroundFillFreeformGradient(String type, List<Integer> color) {
        this.type = type;
        this.color = color;
    }
}
