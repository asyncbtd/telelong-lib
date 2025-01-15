package by.asyncbtd.tll.meta.objects.keyboard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyboardButtonPollType {

    @JsonProperty("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "KeyboardButtonPollType(type=" + this.getType() + ")";
    }

    public KeyboardButtonPollType() {
    }

    public KeyboardButtonPollType(String type) {
        this.type = type;
    }
}
