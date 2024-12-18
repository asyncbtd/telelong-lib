package by.asyncbtd.tll.meta.objects.paid;

public class PaidMediaPreview implements PaidMedia {

    private String type;
    private Integer width;
    private Integer height;
    private Integer duration;

    public String getType() {
        return type;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String toString() {
        return "PaidMediaPreview(type=" + this.getType() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", duration=" + this.getDuration() + ")";
    }

    public PaidMediaPreview() {
    }

    public PaidMediaPreview(String type, Integer width, Integer height, Integer duration) {
        this.type = type;
        this.width = width;
        this.height = height;
        this.duration = duration;
    }
}
