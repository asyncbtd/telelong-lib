package by.asyncbtd.tll.meta.objects;

public class Venue {

    private Location location;
    private String title;
    private String address;
    private String foursquareId;
    private String foursquareType;
    private String googlePlaceId;
    private String googlePlaceType;

    public Location getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public String getFoursquareType() {
        return foursquareType;
    }

    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    public String getGooglePlaceType() {
        return googlePlaceType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    public void setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
    }

    public void setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
    }

    public void setGooglePlaceType(String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
    }

    public String toString() {
        return "Venue(location=" + this.getLocation() +
                ", title=" + this.getTitle() +
                ", address=" + this.getAddress() +
                ", foursquareId=" + this.getFoursquareId() +
                ", foursquareType=" + this.getFoursquareType() +
                ", googlePlaceId=" + this.getGooglePlaceId() +
                ", googlePlaceType=" + this.getGooglePlaceType() + ")";
    }

    public Venue() {
    }

    public Venue(Location location, String title, String address, String foursquareId, String foursquareType, String googlePlaceId, String googlePlaceType) {
        this.location = location;
        this.title = title;
        this.address = address;
        this.foursquareId = foursquareId;
        this.foursquareType = foursquareType;
        this.googlePlaceId = googlePlaceId;
        this.googlePlaceType = googlePlaceType;
    }
}
