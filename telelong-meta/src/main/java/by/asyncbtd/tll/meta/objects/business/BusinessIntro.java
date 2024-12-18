package by.asyncbtd.tll.meta.objects.business;

import by.asyncbtd.tll.meta.objects.Sticker;

public class BusinessIntro {

    private String title;
    private String message;
    private Sticker sticker;

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public String toString() {
        return "BusinessIntro(title=" + this.getTitle() +
                ", message=" + this.getMessage() +
                ", sticker=" + this.getSticker() + ")";
    }

    public BusinessIntro() {
    }

    public BusinessIntro(String title, String message, Sticker sticker) {
        this.title = title;
        this.message = message;
        this.sticker = sticker;
    }
}
