package by.asyncbtd.tll.meta.objects.keyboard.reply;

public class ReplyKeyboardRemove {

    private Boolean removeKeyboard;
    private Boolean selective;

    public Boolean getRemoveKeyboard() {
        return removeKeyboard;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setRemoveKeyboard(Boolean removeKeyboard) {
        this.removeKeyboard = removeKeyboard;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

    public String toString() {
        return "ReplyKeyboardRemove(removeKeyboard=" + this.getRemoveKeyboard() +
                ", selective=" + this.getSelective() + ")";
    }

    public ReplyKeyboardRemove() {
    }

    public ReplyKeyboardRemove(Boolean removeKeyboard, Boolean selective) {
        this.removeKeyboard = removeKeyboard;
        this.selective = selective;
    }
}
