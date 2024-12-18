package by.asyncbtd.tll.meta.objects;

public class Dice {

    private String emoji;
    private Integer value;

    public String getEmoji() {
        return emoji;
    }

    public Integer getValue() {
        return value;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String toString() {
        return "Dice(emoji=" + this.getEmoji() +
                ", value=" + this.getValue() + ")";
    }

    public Dice() {
    }

    public Dice(String emoji, Integer value) {
        this.emoji = emoji;
        this.value = value;
    }
}
