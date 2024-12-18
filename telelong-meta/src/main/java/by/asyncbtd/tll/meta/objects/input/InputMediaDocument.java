package by.asyncbtd.tll.meta.objects.input;

import by.asyncbtd.tll.meta.objects.InputFile;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class InputMediaDocument implements InputMedia {

    private final String type = "video";
    private String media;
    private InputFile thumbnail;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private Boolean showCaptionAboveMedia;

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public InputFile getThumbnail() {
        return thumbnail;
    }

    public String getCaption() {
        return caption;
    }

    public String getParseMode() {
        return parseMode;
    }

    public List<MessageEntity> getCaptionEntities() {
        return captionEntities;
    }

    public Boolean getShowCaptionAboveMedia() {
        return showCaptionAboveMedia;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setThumbnail(InputFile thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setParseMode(String parseMode) {
        this.parseMode = parseMode;
    }

    public void setCaptionEntities(List<MessageEntity> captionEntities) {
        this.captionEntities = captionEntities;
    }

    public void setShowCaptionAboveMedia(Boolean showCaptionAboveMedia) {
        this.showCaptionAboveMedia = showCaptionAboveMedia;
    }

    public String toString() {
        return "InputMediaDocument(type=" + this.getType() +
                ", media=" + this.getMedia() +
                ", thumbnail=" + this.getThumbnail() +
                ", caption=" + this.getCaption() +
                ", parseMode=" + this.getParseMode() +
                ", captionEntities=" + this.getCaptionEntities() +
                ", showCaptionAboveMedia=" + this.getShowCaptionAboveMedia() + ")";
    }

    public InputMediaDocument() {
    }

    public InputMediaDocument(String media, InputFile thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean showCaptionAboveMedia) {
        this.media = media;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.showCaptionAboveMedia = showCaptionAboveMedia;
    }
}
