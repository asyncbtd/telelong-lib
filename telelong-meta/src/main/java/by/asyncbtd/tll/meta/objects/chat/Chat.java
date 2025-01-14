package by.asyncbtd.tll.meta.objects.chat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Chat {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("title")
    private String title;

    @JsonProperty("username")
    private String username;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("is_forum")
    private Boolean isForum;

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getIsForum() {
        return isForum;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIsForum(Boolean forum) {
        isForum = forum;
    }

    public String toString() {
        return "Chat(id=" + this.getId() +
                ", type=" + this.getType() +
                ", title=" + this.getTitle() +
                ", username=" + this.getUsername() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", isForum=" + this.getIsForum() + ")";
    }

    public Chat() {
    }

    public Chat(Long id, String type, String title, String username, String firstName, String lastName, Boolean isForum) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isForum = isForum;
    }
}
