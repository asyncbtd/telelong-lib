package by.asyncbtd.tll.meta.objects.giveaway;

import by.asyncbtd.tll.meta.objects.chat.Chat;

import java.util.List;

public class Giveaway {

    private List<Chat> chats;
    private Integer winnersSelectionDate;
    private Integer winnerCount;
    private Boolean onlyNewMembers;
    private Boolean hasPublicWinners;
    private String prizeDescription;
    private List<String> countryCodes;
    private Integer prizeStarCount;
    private Integer premiumSubscriptionMonthCount;

    public List<Chat> getChats() {
        return chats;
    }

    public Integer getWinnersSelectionDate() {
        return winnersSelectionDate;
    }

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public Boolean getOnlyNewMembers() {
        return onlyNewMembers;
    }

    public Boolean getHasPublicWinners() {
        return hasPublicWinners;
    }

    public String getPrizeDescription() {
        return prizeDescription;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public Integer getPremiumSubscriptionMonthCount() {
        return premiumSubscriptionMonthCount;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    public void setWinnersSelectionDate(Integer winnersSelectionDate) {
        this.winnersSelectionDate = winnersSelectionDate;
    }

    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

    public void setOnlyNewMembers(Boolean onlyNewMembers) {
        this.onlyNewMembers = onlyNewMembers;
    }

    public void setHasPublicWinners(Boolean hasPublicWinners) {
        this.hasPublicWinners = hasPublicWinners;
    }

    public void setPrizeDescription(String prizeDescription) {
        this.prizeDescription = prizeDescription;
    }

    public void setCountryCodes(List<String> countryCodes) {
        this.countryCodes = countryCodes;
    }

    public void setPrizeStarCount(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }

    public void setPremiumSubscriptionMonthCount(Integer premiumSubscriptionMonthCount) {
        this.premiumSubscriptionMonthCount = premiumSubscriptionMonthCount;
    }

    public String toString() {
        return "Giveaway(chats=" + this.getChats() +
                ", winnersSelectionDate=" + this.getWinnersSelectionDate() +
                ", winnerCount=" + this.getWinnerCount() +
                ", onlyNewMembers=" + this.getOnlyNewMembers() +
                ", hasPublicWinners=" + this.getHasPublicWinners() +
                ", prizeDescription=" + this.getPrizeDescription() +
                ", countryCodes=" + this.getCountryCodes() +
                ", prizeStarCount=" + this.getPrizeStarCount() +
                ", premiumSubscriptionMonthCount=" + this.getPremiumSubscriptionMonthCount() + ")";
    }

    public Giveaway() {
    }

    public Giveaway(List<Chat> chats, Integer winnersSelectionDate, Integer winnerCount, Boolean onlyNewMembers, Boolean hasPublicWinners, String prizeDescription,
                    List<String> countryCodes, Integer prizeStarCount, Integer premiumSubscriptionMonthCount) {
        this.chats = chats;
        this.winnersSelectionDate = winnersSelectionDate;
        this.winnerCount = winnerCount;
        this.onlyNewMembers = onlyNewMembers;
        this.hasPublicWinners = hasPublicWinners;
        this.prizeDescription = prizeDescription;
        this.countryCodes = countryCodes;
        this.prizeStarCount = prizeStarCount;
        this.premiumSubscriptionMonthCount = premiumSubscriptionMonthCount;
    }
}
