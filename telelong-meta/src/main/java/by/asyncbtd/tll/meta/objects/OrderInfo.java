package by.asyncbtd.tll.meta.objects;

public class OrderInfo {

    private String name;
    private String phoneNumber;
    private String email;
    private ShippingAddress shippingAddress;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "OrderInfo(name=" + this.getName() +
                ", phoneNumber=" + this.getPhoneNumber() +
                ", email=" + this.getEmail() +
                ", shippingAddress=" + this.getShippingAddress() + ")";
    }

    public OrderInfo() {
    }

    public OrderInfo(String name, String phoneNumber, String email, ShippingAddress shippingAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
}
