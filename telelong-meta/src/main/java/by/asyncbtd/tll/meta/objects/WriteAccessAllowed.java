package by.asyncbtd.tll.meta.objects;

public class WriteAccessAllowed {

    private Boolean fromRequest;
    private String webAppName;
    private Boolean fromAttachmentMenu;

    public Boolean getFromRequest() {
        return fromRequest;
    }

    public String getWebAppName() {
        return webAppName;
    }

    public Boolean getFromAttachmentMenu() {
        return fromAttachmentMenu;
    }

    public void setFromRequest(Boolean fromRequest) {
        this.fromRequest = fromRequest;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public void setFromAttachmentMenu(Boolean fromAttachmentMenu) {
        this.fromAttachmentMenu = fromAttachmentMenu;
    }

    public String toString() {
        return "WriteAccessAllowed(fromRequest=" + this.getFromRequest() +
                ", webAppName=" + this.getWebAppName() +
                ", fromAttachmentMenu=" + this.getFromAttachmentMenu() + ")";
    }

    public WriteAccessAllowed() {
    }

    public WriteAccessAllowed(Boolean fromRequest, String webAppName, Boolean fromAttachmentMenu) {
        this.fromRequest = fromRequest;
        this.webAppName = webAppName;
        this.fromAttachmentMenu = fromAttachmentMenu;
    }
}
