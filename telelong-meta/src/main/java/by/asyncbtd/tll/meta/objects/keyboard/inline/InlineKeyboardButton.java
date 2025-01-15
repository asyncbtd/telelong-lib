package by.asyncbtd.tll.meta.objects.keyboard.inline;

import by.asyncbtd.tll.meta.objects.CopyTextButton;
import by.asyncbtd.tll.meta.objects.LoginUrl;
import by.asyncbtd.tll.meta.objects.SwitchInlineQueryChosenChat;
import by.asyncbtd.tll.meta.objects.game.CallbackGame;
import by.asyncbtd.tll.meta.objects.web.WebAppInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InlineKeyboardButton {

    @JsonProperty("text")
    private String text;

    @JsonProperty("url")
    private String url;

    @JsonProperty("callback_data")
    private String callbackData;

    @JsonProperty("web_app")
    private WebAppInfo webApp;

    @JsonProperty("login_url")
    private LoginUrl loginUrl;

    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;

    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;

    @JsonProperty("switch_inline_query_chosen_chat")
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;

    @JsonProperty("copy_text")
    private CopyTextButton copyText;

    @JsonProperty("callback_game")
    private CallbackGame callbackGame;

    @JsonProperty("pay")
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
