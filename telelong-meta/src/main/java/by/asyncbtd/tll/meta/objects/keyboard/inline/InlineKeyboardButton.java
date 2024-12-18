package by.asyncbtd.tll.meta.objects.keyboard.inline;

import by.asyncbtd.tll.meta.objects.CopyTextButton;
import by.asyncbtd.tll.meta.objects.LoginUrl;
import by.asyncbtd.tll.meta.objects.SwitchInlineQueryChosenChat;
import by.asyncbtd.tll.meta.objects.game.CallbackGame;
import by.asyncbtd.tll.meta.objects.web.WebAppInfo;

public class InlineKeyboardButton {

    private String text;
    private String url;
    private String callbackData;
    private WebAppInfo webApp;
    private LoginUrl loginUrl;
    private String switchInlineQuery;
    private String switchInlineQueryCurrentChat;
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;
    private CopyTextButton copyText;
    private CallbackGame callbackGame;
    private Boolean pay;

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public WebAppInfo getWebApp() {
        return webApp;
    }

    public LoginUrl getLoginUrl() {
        return loginUrl;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public SwitchInlineQueryChosenChat getSwitchInlineQueryChosenChat() {
        return switchInlineQueryChosenChat;
    }

    public CopyTextButton getCopyText() {
        return copyText;
    }

    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }

    public void setLoginUrl(LoginUrl loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryChosenChat(SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
    }

    public void setCopyText(CopyTextButton copyText) {
        this.copyText = copyText;
    }

    public void setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public String toString() {
        return "InlineKeyboardButton(text=" + this.getText() +
                ", url=" + this.getUrl() +
                ", callbackData=" + this.getCallbackData() +
                ", webApp=" + this.getWebApp() +
                ", loginUrl=" + this.getLoginUrl() +
                ", switchInlineQuery=" + this.getSwitchInlineQuery() +
                ", switchInlineQueryCurrentChat=" + this.getSwitchInlineQueryCurrentChat() +
                ", switchInlineQueryChosenChat=" + this.getSwitchInlineQueryChosenChat() +
                ", copyText=" + this.getCopyText() +
                ", callbackGame=" + this.getCallbackGame() +
                ", pay=" + this.getPay() + ")";
    }

    public InlineKeyboardButton(String text, String url, String callbackData, WebAppInfo webApp, LoginUrl loginUrl, String switchInlineQuery,
                                String switchInlineQueryCurrentChat, SwitchInlineQueryChosenChat switchInlineQueryChosenChat, CopyTextButton copyText,
                                CallbackGame callbackGame, Boolean pay) {
        this.text = text;
        this.url = url;
        this.callbackData = callbackData;
        this.webApp = webApp;
        this.loginUrl = loginUrl;
        this.switchInlineQuery = switchInlineQuery;
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
        this.copyText = copyText;
        this.callbackGame = callbackGame;
        this.pay = pay;
    }
}
