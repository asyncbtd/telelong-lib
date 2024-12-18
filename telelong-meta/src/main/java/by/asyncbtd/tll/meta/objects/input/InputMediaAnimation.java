package by.asyncbtd.tll.meta.objects.input;

import by.asyncbtd.tll.meta.objects.InputFile;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class InputMediaAnimation implements InputMedia {

    private final String type = "animation";
    private String media;
    private InputFile thumbnail;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private Boolean showCaptionAboveMedia;
    private Integer width;
    private Integer height;
    private Integer duration;
    private Boolean hasSpoiler;

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

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public Boolean getHasSpoiler() {
        return hasSpoiler;
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

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setHasSpoiler(Boolean hasSpoiler) {
        this.hasSpoiler = hasSpoiler;
    }

    public String toString() {
        return "InputMediaVideo(type=" + this.getType() +
                ", media=" + this.getMedia() +
                ", thumbnail=" + this.getThumbnail() +
                ", caption=" + this.getCaption() +
                ", parseMode=" + this.getParseMode() +
                ", captionEntities=" + this.getCaptionEntities() +
                ", showCaptionAboveMedia=" + this.getShowCaptionAboveMedia() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", duration=" + this.getDuration() +
                ", hasSpoiler=" + this.getHasSpoiler() + ")";
    }

    public InputMediaAnimation() {
    }

    public InputMediaAnimation(String media, InputFile thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities, Boolean showCaptionAboveMedia,
                               Integer width, Integer height, Integer duration, Boolean hasSpoiler) {
        this.media = media;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.showCaptionAboveMedia = showCaptionAboveMedia;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.hasSpoiler = hasSpoiler;
    }
}
