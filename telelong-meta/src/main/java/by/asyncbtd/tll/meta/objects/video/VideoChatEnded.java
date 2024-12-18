package by.asyncbtd.tll.meta.objects.video;

public class VideoChatEnded {

    private Integer duration;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String toString() {
        return "VideoChatEnded(duration=" + this.getDuration() + ")";
    }

    public VideoChatEnded() {
    }

    public VideoChatEnded(Integer duration) {
        this.duration = duration;
    }
}
