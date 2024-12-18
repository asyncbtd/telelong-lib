package by.asyncbtd.tll.meta.objects.input;

import by.asyncbtd.tll.meta.objects.InputFile;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class InputMediaAudio implements InputMedia {

    private final String type = "audio";
    private String media;
    private InputFile thumbnail;
    private String caption;
    private String parseMode;
    private List<MessageEntity> captionEntities;
    private Integer duration;
    private String performer;
    private String title;

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

    public Integer getDuration() {
        return duration;
    }

    public String getPerformer() {
        return performer;
    }

    public String getTitle() {
        return title;
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

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "InputMediaAudio(type=" + this.getType() +
                ", media=" + this.getMedia() +
                ", thumbnail=" + this.getThumbnail() +
                ", caption=" + this.getCaption() +
                ", parseMode=" + this.getParseMode() +
                ", captionEntities=" + this.getCaptionEntities() +
                ", duration=" + this.getDuration() +
                ", performer=" + this.getPerformer() +
                ", title=" + this.getTitle() + ")";
    }

    public InputMediaAudio() {
    }

    public InputMediaAudio(String media, InputFile thumbnail, String caption, String parseMode, List<MessageEntity> captionEntities, Integer duration,
                           String performer, String title) {
        this.media = media;
        this.thumbnail = thumbnail;
        this.caption = caption;
        this.parseMode = parseMode;
        this.captionEntities = captionEntities;
        this.duration = duration;
        this.performer = performer;
        this.title = title;
    }
}
