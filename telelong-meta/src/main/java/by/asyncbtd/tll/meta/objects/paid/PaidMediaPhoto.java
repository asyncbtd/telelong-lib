package by.asyncbtd.tll.meta.objects.paid;

import by.asyncbtd.tll.meta.objects.PhotoSize;

import java.util.List;

public class PaidMediaPhoto implements PaidMedia {

    private String type;
    private List<PhotoSize> photo;

    public String getType() {
        return type;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String toString() {
        return "PaidMediaPhoto(type=" + this.getType() +
                ", photo=" + this.getPhoto() + ")";
    }

    public PaidMediaPhoto() {
    }

    public PaidMediaPhoto(String type, List<PhotoSize> photo) {
        this.type = type;
        this.photo = photo;
    }
}
