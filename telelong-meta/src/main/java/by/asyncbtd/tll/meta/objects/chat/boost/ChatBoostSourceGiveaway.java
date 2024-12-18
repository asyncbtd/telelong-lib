package by.asyncbtd.tll.meta.objects.chat.boost;

import by.asyncbtd.tll.meta.objects.User;

public class ChatBoostSourceGiveaway implements ChatBoostSource {

    private String source;
    private String giveawayMessageId;
    private User user;
    private Integer prizeStarCount;
    private Boolean isUnclaimed;

    public String getSource() {
        return source;
    }

    public String getGiveawayMessageId() {
        return giveawayMessageId;
    }

    public User getUser() {
        return user;
    }

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public Boolean getIsUnclaimed() {
        return isUnclaimed;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setGiveawayMessageId(String giveawayMessageId) {
        this.giveawayMessageId = giveawayMessageId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPrizeStarCount(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }

    public void setIsUnclaimed(Boolean isUnclaimed) {
        this.isUnclaimed = isUnclaimed;
    }

    public String toString() {
        return "ChatBoostSourceGiveaway(source=" + this.getSource() +
                ", giveawayMessageId=" + this.getGiveawayMessageId() +
                ", user=" + this.getUser() +
                ", prizeStarCount=" + this.getPrizeStarCount() +
                ", isUnclaimed=" + this.getIsUnclaimed() + ")";
    }

    public ChatBoostSourceGiveaway() {
    }

    public ChatBoostSourceGiveaway(String source, String giveawayMessageId, User user, Integer prizeStarCount, Boolean isUnclaimed) {
        this.source = source;
        this.giveawayMessageId = giveawayMessageId;
        this.user = user;
        this.prizeStarCount = prizeStarCount;
        this.isUnclaimed = isUnclaimed;
    }
}
