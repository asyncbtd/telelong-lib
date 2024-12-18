package by.asyncbtd.tll.meta.objects;

public class ShippingAddress {

    private String countryCode;
    private String state;
    private String city;
    private String streetLine1;
    private String streetLine2;
    private String postCode;

    public String getCountryCode() {
        return countryCode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String toString() {
        return "ShippingAddress(countryCode=" + this.getCountryCode() +
                ", state=" + this.getState() +
                ", city=" + this.getCity() +
                ", streetLine1=" + this.getStreetLine1() +
                ", streetLine2=" + this.getStreetLine2() +
                ", postCode=" + this.getPostCode() + ")";
    }

    public ShippingAddress() {
    }

    public ShippingAddress(String countryCode, String state, String city, String streetLine1, String streetLine2, String postCode) {
        this.countryCode = countryCode;
        this.state = state;
        this.city = city;
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.postCode = postCode;
    }
}
