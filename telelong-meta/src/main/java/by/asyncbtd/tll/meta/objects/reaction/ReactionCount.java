package by.asyncbtd.tll.meta.objects.reaction;

public class ReactionCount {

    private ReactionType type;
    private Integer totalCount;

    public ReactionType getType() {
        return type;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setType(ReactionType type) {
        this.type = type;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String toString() {
        return "ReactionCount(type=" + this.getType() +
                ", totalCount=" + this.getTotalCount() + ")";
    }

    public ReactionCount() {
    }

    public ReactionCount(ReactionType type, Integer totalCount) {
        this.type = type;
        this.totalCount = totalCount;
    }
}
