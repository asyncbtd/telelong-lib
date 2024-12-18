package by.asyncbtd.tll.meta.objects;

public class ForceReply {

    private Boolean forceReply;
    private String inputFieldPlaceholder;
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
