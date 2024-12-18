package by.asyncbtd.tll.meta.objects.game;

import by.asyncbtd.tll.meta.objects.Animation;
import by.asyncbtd.tll.meta.objects.message.MessageEntity;
import by.asyncbtd.tll.meta.objects.PhotoSize;

import java.util.List;

public class Game {

    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    private List <MessageEntity> textEntities;
    private Animation animation;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public String getText() {
        return text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public String toString() {
        return "Game(title=" + this.getTitle() +
                ", description=" + this.getDescription() +
                ", photo=" + this.getPhoto() +
                ", text=" + this.getText() +
                ", textEntities=" + this.getTextEntities() +
                ", animation=" + this.getAnimation() + ")";
    }

    public Game() {
    }

    public Game(String title, String description, List<PhotoSize> photo, String text, List<MessageEntity> textEntities, Animation animation) {
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.text = text;
        this.textEntities = textEntities;
        this.animation = animation;
    }
}
