package by.asyncbtd.tll.meta.objects.web;

public class WebAppInfo {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return "WebAppInfo(url=" + this.getUrl() + ")";
    }

    public WebAppInfo() {
    }

    public WebAppInfo(String url) {
        this.url = url;
    }
}
