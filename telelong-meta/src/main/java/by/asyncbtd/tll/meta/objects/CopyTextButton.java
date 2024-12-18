package by.asyncbtd.tll.meta.objects;

public class CopyTextButton {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toString() {
        return "CopyTextButton(text=" + this.getText() + ")";
    }

    public CopyTextButton() {
    }

    public CopyTextButton(String text) {
        this.text = text;
    }
}
