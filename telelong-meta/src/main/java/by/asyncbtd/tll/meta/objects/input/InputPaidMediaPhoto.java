package by.asyncbtd.tll.meta.objects.input;

public class InputPaidMediaPhoto implements InputPaidMedia {

    private final String type = "photo";
    private String media;

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String toString() {
        return "InputPaidMediaPhoto(type=" + this.getType() +
                ", media=" + this.getMedia() + ")";
    }

    public InputPaidMediaPhoto() {
    }

    public InputPaidMediaPhoto(String media) {
        this.media = media;
    }
}
