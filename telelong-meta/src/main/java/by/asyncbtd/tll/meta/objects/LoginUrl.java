package by.asyncbtd.tll.meta.objects;

public class LoginUrl {

    private String url;
    private String forwardText;
    private String botUsername;
    private Boolean requestWriteAccess;

    public String getUrl() {
        return url;
    }

    public String getForwardText() {
        return forwardText;
    }

    public String getBotUsername() {
        return botUsername;
    }

    public Boolean getRequestWriteAccess() {
        return requestWriteAccess;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setForwardText(String forwardText) {
        this.forwardText = forwardText;
    }

    public void setBotUsername(String botUsername) {
        this.botUsername = botUsername;
    }

    public void setRequestWriteAccess(Boolean requestWriteAccess) {
        this.requestWriteAccess = requestWriteAccess;
    }

    public String toString() {
        return "LoginUrl(url=" + this.getUrl() +
                ", forwardText=" + this.getForwardText() +
                ", botUsername=" + this.getBotUsername() +
                ", requestWriteAccess=" + this.getRequestWriteAccess() + ")";
    }

    public LoginUrl() {
    }

    public LoginUrl(String url, String forwardText, String botUsername, Boolean requestWriteAccess) {
        this.url = url;
        this.forwardText = forwardText;
        this.botUsername = botUsername;
        this.requestWriteAccess = requestWriteAccess;
    }
}
