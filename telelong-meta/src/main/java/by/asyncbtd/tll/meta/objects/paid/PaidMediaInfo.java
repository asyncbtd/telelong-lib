package by.asyncbtd.tll.meta.objects.paid;

import java.util.List;

public class PaidMediaInfo {

    private Integer starCount;
    private List<PaidMedia> paidMedia;

    public Integer getStarCount() {
        return starCount;
    }

    public List<PaidMedia> getPaidMedia() {
        return paidMedia;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    public void setPaidMedia(List<PaidMedia> paidMedia) {
        this.paidMedia = paidMedia;
    }

    public String toString() {
        return "PaidMediaInfo(starCount=" + this.getStarCount() +
                ", paidMedia=" + this.getPaidMedia() + ")";
    }

    public PaidMediaInfo(){
    }

    public PaidMediaInfo(Integer starCount, List<PaidMedia> paidMedia) {
        this.starCount = starCount;
        this.paidMedia = paidMedia;
    }
}
