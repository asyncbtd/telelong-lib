package by.asyncbtd.tll.meta.objects.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebAppInfo {

    @JsonProperty("url")
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
