package by.asyncbtd.tll.meta.objects.reaction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReactionCount {

    @JsonProperty("type")
    private ReactionType type;

    @JsonProperty("totalCount")
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
