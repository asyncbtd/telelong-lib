package by.asyncbtd.tll.meta.objects.business;

import by.asyncbtd.tll.meta.objects.Location;

public class BusinessLocation {

    private String address;
    private Location location;

    public String getAddress() {
        return address;
    }

    public Location getLocation() {
        return location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String toString() {
        return "BusinessLocation(address=" + this.getAddress() +
                ", location=" + this.getLocation() + ")";
    }

    public BusinessLocation() {
    }

    public BusinessLocation(String address, Location location) {
        this.address = address;
        this.location = location;
    }
}
