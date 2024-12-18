package by.asyncbtd.tll.meta.objects.chat.boost;

public class ChatBoost {

    private String boostId;
    private Integer addDate;
    private Integer expirationDate;
    private ChatBoostSource source;

    public String getBoostId() {
        return boostId;
    }

    public Integer getAddDate() {
        return addDate;
    }

    public Integer getExpirationDate() {
        return expirationDate;
    }

    public ChatBoostSource getSource() {
        return source;
    }

    public void setBoostId(String boostId) {
        this.boostId = boostId;
    }

    public void setAddDate(Integer addDate) {
        this.addDate = addDate;
    }

    public void setExpirationDate(Integer expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setSource(ChatBoostSource source) {
        this.source = source;
    }

    public String toString() {
        return "ChatBoost(boostId=" + this.getBoostId() +
                ", addDate=" + this.getAddDate() +
                ", expirationDate=" + this.getExpirationDate() +
                ", source=" + this.getSource() + ")";
    }

    public ChatBoost() {

    }

    public ChatBoost(String boostId, Integer addDate, Integer expirationDate, ChatBoostSource source) {
        this.boostId = boostId;
        this.addDate = addDate;
        this.expirationDate = expirationDate;
        this.source = source;
    }
}
