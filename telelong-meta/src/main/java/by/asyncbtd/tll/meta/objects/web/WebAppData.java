package by.asyncbtd.tll.meta.objects.web;

public class WebAppData {

    private String data;
    private String buttonText;

    public String getData() {
        return data;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String toString() {
        return "WebAppData(data=" + this.getData() +
                ", buttonText=" + this.getButtonText() + ")";
    }

    public WebAppData() {
    }

    public WebAppData(String data, String buttonText) {
        this.data = data;
        this.buttonText = buttonText;
    }
}
