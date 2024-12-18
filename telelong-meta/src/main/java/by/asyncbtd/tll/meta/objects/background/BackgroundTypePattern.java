package by.asyncbtd.tll.meta.objects.background;

import by.asyncbtd.tll.meta.objects.Document;

public class BackgroundTypePattern implements BackgroundType {

    private String type;
    private Document document;
    private BackgroundFill fill;
    private Integer intensity;
    private Boolean isInverted;
    private Boolean isMoving;

    public String getType() {
        return type;
    }

    public Document getDocument() {
        return document;
    }

    public BackgroundFill getFill() {
        return fill;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public Boolean getIsInverted() {
        return isInverted;
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

    public void setFill(BackgroundFill fill) {
        this.fill = fill;
    }

    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }

    public void setIsInverted(Boolean isInverted) {
        this.isInverted = isInverted;
    }

    public void setIsMoving(Boolean isMoving) {
        this.isMoving = isMoving;
    }

    public String toString() {
        return "BackgroundTypePattern(type=" + this.getType() +
                ", document=" + this.getDocument() +
                ", fill=" + this.getFill() +
                ", intensity=" + this.getIntensity() +
                ", isInverted=" + this.getIsInverted() +
                ", isMoving=" + this.getIsMoving() + ")";
    }

    public BackgroundTypePattern() {
    }

    public BackgroundTypePattern(String type, Document document, BackgroundFill fill, Integer intensity, Boolean isInverted, Boolean isMoving) {
        this.type = type;
        this.document = document;
        this.fill = fill;
        this.intensity = intensity;
        this.isInverted = isInverted;
        this.isMoving = isMoving;
    }
}
