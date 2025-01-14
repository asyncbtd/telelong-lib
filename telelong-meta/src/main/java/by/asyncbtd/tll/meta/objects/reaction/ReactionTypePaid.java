package by.asyncbtd.tll.meta.objects.reaction;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReactionTypePaid implements ReactionType {

    @JsonProperty("type")
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
