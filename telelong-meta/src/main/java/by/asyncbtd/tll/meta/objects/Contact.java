package by.asyncbtd.tll.meta.objects;

public class Contact {

    private String phoneNumber;
    private String firstName;
    private String lastName;
    private Long userId;
    private String vcard;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getVcard() {
        return vcard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    public String toString() {
        return "Contact(phoneNumber=" + this.getPhoneNumber() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", userId=" + this.getUserId() +
                ", vcard=" + this.getVcard() + ")";
    }

    public Contact() {
    }

    public Contact(String phoneNumber, String firstName, String lastName, Long userId, String vcard) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.vcard = vcard;
    }
}
