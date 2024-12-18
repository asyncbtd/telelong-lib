package by.asyncbtd.tll.meta.objects.input;

import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class InputMediaPhoto implements InputMedia {

    private final String type = "photo";
    private String media;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private Boolean showCaptionAboveMedia;
    private Boolean hasSpoiler;

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
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

    public Boolean getHasSpoiler() {
        return hasSpoiler;
    }

    public String toString() {
        return "InputMediaPhoto(type=" + this.getType() +
                ", media=" + this.getMedia() +
                ", caption=" + this.getCaption() +
                ", parseMode=" + this.getParseMode() +
                ", captionEntities=" + this.getCaptionEntities() +
                ", showCaptionAboveMedia=" + this.getShowCaptionAboveMedia() +
                ", hasSpoiler=" + this.getHasSpoiler() + ")";
    }

    public InputMediaPhoto() {
    }

    public InputMediaPhoto(String media, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean showCaptionAboveMedia, Boolean hasSpoiler) {
        this.media = media;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        this.hasSpoiler = hasSpoiler;
    }
}
