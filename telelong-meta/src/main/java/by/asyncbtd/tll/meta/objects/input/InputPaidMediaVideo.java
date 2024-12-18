package by.asyncbtd.tll.meta.objects.input;

import by.asyncbtd.tll.meta.objects.InputFile;

public class InputPaidMediaVideo implements InputPaidMedia {

    private final String type = "video";
    private String media;
    private InputFile thumbnail;
    private Integer width;
    private Integer height;
    private Integer duration;
    private Boolean supportsStreaming;

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public InputFile getThumbnail() {
        return thumbnail;
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

    public Boolean getSupportsStreaming() {
        return supportsStreaming;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setThumbnail(InputFile thumbnail) {
        this.thumbnail = thumbnail;
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

    public void setSupportsStreaming(Boolean supportsStreaming) {
        this.supportsStreaming = supportsStreaming;
    }

    public String toString() {
        return "InputPaidMediaVideo(type=" + this.getType() +
                ", media=" + this.getMedia() +
                ", thumbnail=" + this.getThumbnail() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", duration=" + this.getDuration() +
                ", supportsStreaming=" + this.getSupportsStreaming() + ")";
    }

    public InputPaidMediaVideo() {
    }

    public InputPaidMediaVideo(String media, InputFile thumbnail, Integer width, Integer height, Integer duration, Boolean supportsStreaming) {
        this.media = media;
        this.thumbnail = thumbnail;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.supportsStreaming = supportsStreaming;
    }
}
