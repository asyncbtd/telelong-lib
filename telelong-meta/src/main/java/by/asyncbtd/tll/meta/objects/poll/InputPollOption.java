package by.asyncbtd.tll.meta.objects.poll;

import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class InputPollOption {

    private String text;
    private String textParseMode;
    private List<MessageEntity> textEntities;

    public String getText() {
        return text;
    }

    public String getTextParseMode() {
        return textParseMode;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextParseMode(String textParseMode) {
        this.textParseMode = textParseMode;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public String toString() {
        return "InputPollOption(text=" + this.getText() +
                ", textParseMode=" + this.getTextParseMode() +
                ", textEntities=" + this.getTextEntities() + ")";
    }

    public InputPollOption() {
    }

    public InputPollOption(String text, String textParseMode, List<MessageEntity> textEntities) {
        this.text = text;
        this.textParseMode = textParseMode;
        this.textEntities = textEntities;
    }
}
