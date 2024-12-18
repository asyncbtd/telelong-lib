package by.asyncbtd.tll.meta.objects.paid;

import by.asyncbtd.tll.meta.objects.video.Video;

public class PaidMediaVideo implements PaidMedia {

    private String type;
    private Video video;

    public String getType() {
        return type;
    }

    public Video getVideo() {
        return video;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public String toString() {
        return "PaidMediaVideo(type=" + this.getType() +
                ", video=" + this.getVideo() + ")";
    }

    public PaidMediaVideo() {
    }

    public PaidMediaVideo(String type, Video video) {
        this.type = type;
        this.video = video;
    }
}
