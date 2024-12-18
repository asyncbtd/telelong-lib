package by.asyncbtd.tll.meta.objects;

import java.util.List;

public class SharedUser {

    private Long userId;
    private String firstName;
    private String lastName;
    private String username;
    private List<PhotoSize> photo;

    public Long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String toString() {
        return "SharedUser(userId=" + this.getUserId() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", username=" + this.getUsername() +
                ", photo=" + this.getPhoto() + ")";
    }

    public SharedUser() {
    }

    public SharedUser(Long userId, String firstName, String lastName, String username, List<PhotoSize> photo) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.photo = photo;
    }
}
