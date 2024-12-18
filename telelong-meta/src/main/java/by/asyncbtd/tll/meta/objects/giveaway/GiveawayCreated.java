package by.asyncbtd.tll.meta.objects.giveaway;

public class GiveawayCreated {

    private Integer prizeStarCount;

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public void setPrizeStarCount(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }

    public String toString() {
        return "GiveawayCreated(prizeStarCount=" + this.getPrizeStarCount() + ")";
    }

    public GiveawayCreated() {
    }

    public GiveawayCreated(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }
}
