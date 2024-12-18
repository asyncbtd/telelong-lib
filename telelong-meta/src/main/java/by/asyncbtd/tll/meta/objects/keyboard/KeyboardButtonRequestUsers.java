package by.asyncbtd.tll.meta.objects.keyboard;

public class KeyboardButtonRequestUsers {

    private Integer requestId;
    private Boolean userIsBot;
    private Boolean userIsPremium;
    private Integer max_quantity;
    private Boolean requestName;
    private Boolean requestUsername;
    private Boolean requestPhoto;

    public Integer getRequestId() {
        return requestId;
    }

    public Boolean getUserIsBot() {
        return userIsBot;
    }

    public Boolean getUserIsPremium() {
        return userIsPremium;
    }

    public Integer getMax_quantity() {
        return max_quantity;
    }

    public Boolean getRequestName() {
        return requestName;
    }

    public Boolean getRequestUsername() {
        return requestUsername;
    }

    public Boolean getRequestPhoto() {
        return requestPhoto;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public void setUserIsBot(Boolean userIsBot) {
        this.userIsBot = userIsBot;
    }

    public void setUserIsPremium(Boolean userIsPremium) {
        this.userIsPremium = userIsPremium;
    }

    public void setMax_quantity(Integer max_quantity) {
        this.max_quantity = max_quantity;
    }

    public void setRequestName(Boolean requestName) {
        this.requestName = requestName;
    }

    public void setRequestUsername(Boolean requestUsername) {
        this.requestUsername = requestUsername;
    }

    public void setRequestPhoto(Boolean requestPhoto) {
        this.requestPhoto = requestPhoto;
    }

    public String toString() {
        return "KeyboardButtonRequestUsers(requestId=" + this.getRequestId() +
                ", userIsBot=" + this.getUserIsBot() +
                ", userIsPremium=" + this.getUserIsPremium() +
                ", max_quantity=" + this.getMax_quantity() +
                ", requestName=" + this.getRequestName() +
                ", requestUsername=" + this.getRequestUsername() +
                ", requestPhoto=" + this.getRequestPhoto() + ")";
    }

    public KeyboardButtonRequestUsers() {
    }

    public KeyboardButtonRequestUsers(Integer requestId, Boolean userIsBot, Boolean userIsPremium, Integer max_quantity, Boolean requestName, Boolean requestUsername,
                                      Boolean requestPhoto) {
        this.requestId = requestId;
        this.userIsBot = userIsBot;
        this.userIsPremium = userIsPremium;
        this.max_quantity = max_quantity;
        this.requestName = requestName;
        this.requestUsername = requestUsername;
        this.requestPhoto = requestPhoto;
    }
}
