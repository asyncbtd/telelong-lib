package by.asyncbtd.tll.meta.objects.background;

import by.asyncbtd.tll.meta.objects.Document;

public class BackgroundTypeWallpaper implements BackgroundType {

    private String type;
    private Document document;
    private Integer darkThemeDimming;
    private Boolean isBlurred;
    private Boolean isMoving;

    public String getType() {
        return type;
    }

    public Document getDocument() {
        return document;
    }

    public Integer getDarkThemeDimming() {
        return darkThemeDimming;
    }

    public Boolean getIsBlurred() {
        return isBlurred;
    }

    public Boolean getIsMoving() {
        return isMoving;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void setDarkThemeDimming(Integer darkThemeDimming) {
        this.darkThemeDimming = darkThemeDimming;
    }

    public void setIsBlurred(Boolean isBlurred) {
        this.isBlurred = isBlurred;
    }

    public void setIsMoving(Boolean isMoving) {
        this.isMoving = isMoving;
    }

    public String toString() {
        return "BackgroundTypeWallpaper(type=" + this.getType() +
                ", document=" + this.getDocument() +
                ", darkThemeDimming=" + this.getDarkThemeDimming() +
                ", isBlurred=" + this.getIsBlurred() +
                ", isMoving=" + this.getIsMoving() + ")";
    }

    public BackgroundTypeWallpaper() {
    }

    public BackgroundTypeWallpaper(String type, Document document, Integer darkThemeDimming, Boolean isBlurred, Boolean isMoving) {
        this.type = type;
        this.document = document;
        this.darkThemeDimming = darkThemeDimming;
        this.isBlurred = isBlurred;
        this.isMoving = isMoving;
    }
}
