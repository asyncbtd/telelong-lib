package by.asyncbtd.tll.meta.objects.keyboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForceReply {

    @JsonProperty("force_reply")
    private Boolean forceReply;

    @JsonProperty("input_field_placeholder")
    private String inputFieldPlaceholder;

    @JsonProperty("selective")
    private Boolean selective;

    public Boolean getForceReply() {
        return forceReply;
    }

    public String getInputFieldPlaceholder() {
        return inputFieldPlaceholder;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setForceReply(Boolean forceReply) {
        this.forceReply = forceReply;
    }

    public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

    @Override
    public String toString() {
        return "ForceReply(forceReply=" + this.getForceReply() +
                ", inputFieldPlaceholder=" + this.getInputFieldPlaceholder() +
                ", selective=" + this.getSelective() + ")";
    }

    public ForceReply() {
    }

    public ForceReply(Boolean forceReply, String inputFieldPlaceholder, Boolean selective) {
        this.forceReply = forceReply;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.selective = selective;
    }
}
