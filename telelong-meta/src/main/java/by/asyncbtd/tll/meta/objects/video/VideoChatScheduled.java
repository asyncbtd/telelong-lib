package by.asyncbtd.tll.meta.objects.video;

public class VideoChatScheduled {

    private Integer startDate;

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public String toString() {
        return "VideoChatScheduled(startDate=" + this.getStartDate() + ")";
    }

    public VideoChatScheduled() {
    }

    public VideoChatScheduled(Integer startDate) {
        this.startDate = startDate;
    }
}
