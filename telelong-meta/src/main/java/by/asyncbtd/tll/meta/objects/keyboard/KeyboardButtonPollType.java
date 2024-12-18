package by.asyncbtd.tll.meta.objects.keyboard;

public class KeyboardButtonPollType {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "KeyboardButtonPollType(type=" + this.getType() + ")";
    }

    public KeyboardButtonPollType() {
    }

    public KeyboardButtonPollType(String type) {
        this.type = type;
    }
}
