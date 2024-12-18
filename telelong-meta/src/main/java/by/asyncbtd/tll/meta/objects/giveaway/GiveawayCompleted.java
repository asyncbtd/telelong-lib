package by.asyncbtd.tll.meta.objects.giveaway;

import by.asyncbtd.tll.meta.objects.message.Message;

public class GiveawayCompleted {

    private Integer winnerCount;
    private Integer unclaimedPrizeCount;
    private Message giveawayMessage;
    private Boolean isStarGiveaway;

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public Integer getUnclaimedPrizeCount() {
        return unclaimedPrizeCount;
    }

    public Message getGiveawayMessage() {
        return giveawayMessage;
    }

    public Boolean getIsStarGiveaway() {
        return isStarGiveaway;
    }

    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

    public void setUnclaimedPrizeCount(Integer unclaimedPrizeCount) {
        this.unclaimedPrizeCount = unclaimedPrizeCount;
    }

    public void setGiveawayMessage(Message giveawayMessage) {
        this.giveawayMessage = giveawayMessage;
    }

    public void setIsStarGiveaway(Boolean isStarGiveaway) {
        this.isStarGiveaway = isStarGiveaway;
    }

    public String toString() {
        return "GiveawayCompleted(winnerCount=" + this.getWinnerCount() +
                ", unclaimedPrizeCount=" + this.getUnclaimedPrizeCount() +
                ", giveawayMessage=" + this.getGiveawayMessage() +
                ", isStarGiveaway=" + this.getIsStarGiveaway() + ")";
    }

    public GiveawayCompleted() {
    }

    public GiveawayCompleted(Integer winnerCount, Integer unclaimedPrizeCount, Message giveawayMessage, Boolean isStarGiveaway) {
        this.winnerCount = winnerCount;
        this.unclaimedPrizeCount = unclaimedPrizeCount;
        this.giveawayMessage = giveawayMessage;
        this.isStarGiveaway = isStarGiveaway;
    }
}
