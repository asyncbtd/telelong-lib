package by.asyncbtd.tll.meta.objects;

import by.asyncbtd.tll.meta.objects.message.MessageEntity;

import java.util.List;

public class TextQuote {

    private String text;
    private List<MessageEntity> entities;
    private Integer position;
    private Boolean isManual;

    public String getText() {
        return text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public Integer getPosition() {
        return position;
    }

    public Boolean getIsManual() {
        return isManual;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setIsManual(Boolean isManual) {
        this.isManual = isManual;
    }

    public String toString() {
        return "TextQuote(text=" + this.getText() +
                ", entities=" + this.getEntities() +
                ", position=" + this.getPosition() +
                ", isManual=" + this.getIsManual() + ")";
    }

    public TextQuote() {
    }

    public TextQuote(String text, List<MessageEntity> entities, Integer position, Boolean isManual) {
        this.text = text;
        this.entities = entities;
        this.position = position;
        this.isManual = isManual;
    }
}
