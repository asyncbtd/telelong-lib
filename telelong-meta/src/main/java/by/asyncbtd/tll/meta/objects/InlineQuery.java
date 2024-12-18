package by.asyncbtd.tll.meta.objects;

public class InlineQuery {

    private String id;
    private User from;
    private String query;
    private String offset;
    private String chatType;
    private Location location;

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public String getQuery() {
        return query;
    }

    public String getOffset() {
        return offset;
    }

    public String getChatType() {
        return chatType;
    }

    public Location getLocation() {
        return location;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public InlineQuery() {
    }

    public InlineQuery(String id, User from, String query, String offset, String chatType, Location location) {
        this.id = id;
        this.from = from;
        this.query = query;
        this.offset = offset;
        this.chatType = chatType;
        this.location = location;
    }
}
