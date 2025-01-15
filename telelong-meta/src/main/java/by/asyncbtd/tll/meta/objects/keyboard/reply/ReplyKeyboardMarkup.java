package by.asyncbtd.tll.meta.objects.keyboard.reply;

import by.asyncbtd.tll.meta.objects.keyboard.KeyboardButton;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReplyKeyboardMarkup {

    @JsonProperty("keyboard")
    private List<List<KeyboardButton>> keyboard;

    @JsonProperty("is_persistent")
    private Boolean isPersistent;

    @JsonProperty("resize_keyboard")
    private Boolean resizeKeyboard;

    @JsonProperty("one_time_keyboard")
    private Boolean oneTimeKeyboard;

    @JsonProperty("input_field_placeholder")
    private String inputFieldPlaceholder;

    @JsonProperty("selective")
    private Boolean selective;

    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    public Boolean getIsPersistent() {
        return isPersistent;
    }

    public Boolean getResizeKeyboard() {
        return resizeKeyboard;
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

    public void setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
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
                ", resizeKeyboard=" + this.getResizeKeyboard() +
                ", oneTimeKeyboard=" + this.getOneTimeKeyboard() +
                ", inputFieldPlaceholder=" + this.getInputFieldPlaceholder() +
                ", selective=" + this.getSelective() + ")";
    }

    public ReplyKeyboardMarkup() {
    }

    public ReplyKeyboardMarkup(List<List<KeyboardButton>> keyboard, Boolean isPersistent, Boolean resizeKeyboard,
                               Boolean oneTimeKeyboard, String inputFieldPlaceholder, Boolean selective) {
        this.keyboard = keyboard;
        this.isPersistent = isPersistent;
        this.resizeKeyboard = resizeKeyboard;
        this.oneTimeKeyboard = oneTimeKeyboard;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.selective = selective;
    }
}
