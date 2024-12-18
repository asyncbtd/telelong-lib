package by.asyncbtd.tll.meta.objects.menu;

import by.asyncbtd.tll.meta.objects.web.WebAppInfo;

public class MenuButtonWebApp implements MenuButton {

    private final String type = "web_app";
    private String text;
    private WebAppInfo webApp;

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public WebAppInfo getWebApp() {
        return webApp;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }

    public String toString() {
        return "MenuButtonWebApp(type=" + this.getType() +
                ", text=" + this.getText() +
                ", webApp=" + this.getWebApp() + ")";
    }

    public MenuButtonWebApp() {
    }

    public MenuButtonWebApp(String text, WebAppInfo webApp) {
        this.text = text;
        this.webApp = webApp;
    }
}
