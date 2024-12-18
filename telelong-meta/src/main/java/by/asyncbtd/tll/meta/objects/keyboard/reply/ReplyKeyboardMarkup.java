package by.asyncbtd.tll.meta.objects.keyboard.reply;

import by.asyncbtd.tll.meta.objects.keyboard.KeyboardButton;

import java.util.List;

public class ReplyKeyboardMarkup {

    private List<List<KeyboardButton>> keyboard;
    private Boolean isPersistent;
    private Boolean oneTimeKeyboard;
    private String inputFieldPlaceholder;
    private Boolean selective;

    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    public Boolean getIsPersistent() {
        return isPersistent;
    }

    public Boolean getOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public String getInputFieldPlaceholder() {
        return inputFieldPlaceholder;
    }

    public Boolean getSelective() {
        return selective;
    }

    public void setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
    }

    public void setIsPersistent(Boolean isPersistent) {
        this.isPersistent = isPersistent;
    }

    public void setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
    }

    public void setInputFieldPlaceholder(String inputFieldPlaceholder) {
        this.inputFieldPlaceholder = inputFieldPlaceholder;
    }

    public void setSelective(Boolean selective) {
        this.selective = selective;
    }

    public String toString() {
        return "ReplyKeyboardMarkup(keyboard=" + this.getKeyboard() +
                ", isPersistent=" + this.getIsPersistent() +
                ", oneTimeKeyboard=" + this.getOneTimeKeyboard() +
                ", inputFieldPlaceholder=" + this.getInputFieldPlaceholder() +
                ", selective=" + this.getSelective() + ")";
    }

    public ReplyKeyboardMarkup() {
    }

    public ReplyKeyboardMarkup(List<List<KeyboardButton>> keyboard, Boolean isPersistent, Boolean oneTimeKeyboard, String inputFieldPlaceholder, Boolean selective) {
        this.keyboard = keyboard;
        this.isPersistent = isPersistent;
        this.oneTimeKeyboard = oneTimeKeyboard;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.selective = selective;
    }
}
