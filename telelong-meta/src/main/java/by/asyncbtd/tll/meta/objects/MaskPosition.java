package by.asyncbtd.tll.meta.objects;

public class MaskPosition {

    private String point;
    private Float xShift;
    private Float yShift;
    private Float scale;

    public String getPoint() {
        return point;
    }

    public Float getxShift() {
        return xShift;
    }

    public Float getyShift() {
        return yShift;
    }

    public Float getScale() {
        return scale;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public void setxShift(Float xShift) {
        this.xShift = xShift;
    }

    public void setyShift(Float yShift) {
        this.yShift = yShift;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public String toString() {
        return "MaskPosition(point=" + this.getPoint() +
                ", xShift=" + this.getxShift() +
                ", yShift=" + this.getyShift() +
                ", scale=" + this.getScale() + ")";
    }

    public MaskPosition() {
    }

    public MaskPosition(String point, Float xShift, Float yShift, Float scale) {
        this.point = point;
        this.xShift = xShift;
        this.yShift = yShift;
        this.scale = scale;
    }
}
