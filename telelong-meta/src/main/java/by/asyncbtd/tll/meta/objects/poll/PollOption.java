package by.asyncbtd.tll.meta.objects.poll;

import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class PollOption {

    private String text;
    private List<MessageEntity> textEntities;
    private Integer voterCount;

    public String getText() {
        return text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public Integer getVoterCount() {
        return voterCount;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public void setVoterCount(Integer voterCount) {
        this.voterCount = voterCount;
    }

    public String toString() {
        return "PollOption(text=" + this.getText() +
                ", textEntities=" + this.getTextEntities() +
                ", voterCount=" + this.getVoterCount() + ")";
    }

    public PollOption() {
    }

    public PollOption(String text, List<MessageEntity> textEntities, Integer voterCount) {
        this.text = text;
        this.textEntities = textEntities;
        this.voterCount = voterCount;
    }
}
