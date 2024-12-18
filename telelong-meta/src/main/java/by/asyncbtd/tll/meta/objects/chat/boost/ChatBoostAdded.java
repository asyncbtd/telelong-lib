package by.asyncbtd.tll.meta.objects.chat.boost;

public class ChatBoostAdded {

    private Integer boostCount;

    public Integer getBoostCount() {
        return boostCount;
    }

    public void setBoostCount(Integer boostCount) {
        this.boostCount = boostCount;
    }

    public String toString() {
        return "ChatBoostAdded(boostCount=" + this.getBoostCount() +")";
    }

    public ChatBoostAdded() {
    }

    public ChatBoostAdded(Integer boostCount) {
        this.boostCount = boostCount;
    }
}
