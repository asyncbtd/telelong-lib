package by.asyncbtd.tll.meta.objects.keyboard;

import by.asyncbtd.tll.meta.objects.web.WebAppInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyboardButton {

    @JsonProperty("text")
    private String text;

    @JsonProperty("request_users")
    private KeyboardButtonRequestUsers requestUsers;

    @JsonProperty("request_chat")
    private KeyboardButtonRequestChat requestChat;

    @JsonProperty("request_contact")
    private Boolean requestContact;

    @JsonProperty("request_location")
    private Boolean requestLocation;

    @JsonProperty("request_poll")
    private KeyboardButtonPollType requestPoll;

    @JsonProperty("web_app")
    private WebAppInfo webApp;

    public String getText() {
        return text;
    }

    public KeyboardButtonRequestUsers getRequestUsers() {
        return requestUsers;
    }

    public KeyboardButtonRequestChat getRequestChat() {
        return requestChat;
    }

    public Boolean getRequestContact() {
        return requestContact;
    }

    public Boolean getRequestLocation() {
        return requestLocation;
    }

    public KeyboardButtonPollType getRequestPoll() {
        return requestPoll;
    }

    public WebAppInfo getWebApp() {
        return webApp;
    }


    public void setText(String text) {
        this.text = text;
    }

    public void setRequestUsers(KeyboardButtonRequestUsers requestUsers) {
        this.requestUsers = requestUsers;
    }

    public void setRequestChat(KeyboardButtonRequestChat requestChat) {
        this.requestChat = requestChat;
    }

    public void setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
    }

    public void setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
    }

    public void setRequestPoll(KeyboardButtonPollType requestPoll) {
        this.requestPoll = requestPoll;
    }

    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }

    public String toString() {
        return "KeyboardButton(text=" + this.getText() +
                ", requestUsers=" + this.getRequestUsers() +
                ", requestChat=" + this.getRequestChat() +
                ", requestContact=" + this.getRequestContact() +
                ", requestLocation=" + this.getRequestLocation() +
                ", requestPoll=" + this.getRequestPoll() +
                ", webApp=" + this.getWebApp() + ")";
    }

    public KeyboardButton() {
    }

    public KeyboardButton(String text, KeyboardButtonRequestUsers requestUsers, KeyboardButtonRequestChat requestChat, Boolean requestContact, Boolean requestLocation,
                          KeyboardButtonPollType requestPoll, WebAppInfo webApp) {
        this.text = text;
        this.requestUsers = requestUsers;
        this.requestChat = requestChat;
        this.requestContact = requestContact;
        this.requestLocation = requestLocation;
        this.requestPoll = requestPoll;
        this.webApp = webApp;
    }
}
