package by.asyncbtd.tll.meta.objects.keyboard.inline;

import java.util.List;

public class InlineKeyboardMarkup {

    private List<List<InlineKeyboardButton>> inlineKeyboard;

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    public String toString() {
        return "InlineKeyboardMarkup(inlineKeyboard=" + this.getInlineKeyboard() + ")";
    }

    public InlineKeyboardMarkup() {
    }

    public InlineKeyboardMarkup(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }
}
