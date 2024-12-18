package by.asyncbtd.tll.meta.objects.keyboard;

import by.asyncbtd.tll.meta.objects.web.WebAppInfo;

public class KeyboardButton {

    private String text;
    private KeyboardButtonRequestUsers requestUsers;
    private KeyboardButtonRequestChat requestChat;
    private Boolean requestContact;
    private Boolean requestLocation;
    private KeyboardButtonPollType requestPoll;
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
