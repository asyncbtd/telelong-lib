package by.asyncbtd.tll.meta.objects;

public class ChosenInlineResult {

    private String resultId;
    private User from;
    private Location location;
    private String inlineMessageId;
    private String query;

    public String getResultId() {
        return resultId;
    }

    public User getFrom() {
        return from;
    }

    public Location getLocation() {
        return location;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getQuery() {
        return query;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String toString() {
        return "ChosenInlineResult(resultId=" + this.getResultId() +
                ", from=" + this.getFrom() +
                ", location=" + this.getLocation() +
                ", inlineMessageId=" + this.getInlineMessageId() +
                ", query=" + this.getQuery() + ")";
    }

    public ChosenInlineResult() {
    }

    public ChosenInlineResult(String resultId, User from, Location location, String inlineMessageId, String query) {
        this.resultId = resultId;
        this.from = from;
        this.location = location;
        this.inlineMessageId = inlineMessageId;
        this.query = query;
    }
}
