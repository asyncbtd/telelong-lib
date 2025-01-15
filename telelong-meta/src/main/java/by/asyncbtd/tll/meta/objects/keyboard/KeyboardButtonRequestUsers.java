package by.asyncbtd.tll.meta.objects.keyboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyboardButtonRequestUsers {

    @JsonProperty("request_id")
    private Integer requestId;

    @JsonProperty("user_is_bot")
    private Boolean userIsBot;

    @JsonProperty("user_is_premium")
    private Boolean userIsPremium;

    @JsonProperty("max_quantity")
    private Integer maxQuantity;

    @JsonProperty("request_name")
    private Boolean requestName;

    @JsonProperty("request_username")
    private Boolean requestUsername;

    @JsonProperty("request_photo")
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

    public Integer getMaxQuantity() {
        return maxQuantity;
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

    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
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
                ", max_quantity=" + this.getMaxQuantity() +
                ", requestName=" + this.getRequestName() +
                ", requestUsername=" + this.getRequestUsername() +
                ", requestPhoto=" + this.getRequestPhoto() + ")";
    }

    public KeyboardButtonRequestUsers() {
    }

    public KeyboardButtonRequestUsers(Integer requestId, Boolean userIsBot, Boolean userIsPremium, Integer maxQuantity,
                                      Boolean requestName, Boolean requestUsername, Boolean requestPhoto) {
        this.requestId = requestId;
        this.userIsBot = userIsBot;
        this.userIsPremium = userIsPremium;
        this.maxQuantity = maxQuantity;
        this.requestName = requestName;
        this.requestUsername = requestUsername;
        this.requestPhoto = requestPhoto;
    }
}
