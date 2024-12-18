package by.asyncbtd.tll.meta.objects.reaction;

public class ReactionTypePaid implements ReactionType {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "ReactionTypePaid(type=" + this.getType() + ")";
    }

    public ReactionTypePaid() {
    }

    public ReactionTypePaid(String type) {
        this.type = type;
    }
}
