package by.asyncbtd.tll.meta.objects;

public class Location {

    private Float latitude;
    private Float longitude;
    private Float horizontalAccuracy;
    private Integer livePeriod;
    private Integer heading;
    private Integer proximityAlertRadius;

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Float getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public Integer getLivePeriod() {
        return livePeriod;
    }

    public Integer getHeading() {
        return heading;
    }

    public Integer getProximityAlertRadius() {
        return proximityAlertRadius;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public void setHorizontalAccuracy(Float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
    }

    public void setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public void setProximityAlertRadius(Integer proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
    }

    public String toString() {
        return "Location(latitude=" + this.getLatitude() +
                ", longitude=" + this.getLongitude() +
                ", horizontalAccuracy=" + this.getHorizontalAccuracy() +
                ", livePeriod=" + this.getLivePeriod() +
                ", heading=" + this.getHeading() +
                ", proximityAlertRadius=" + this.getProximityAlertRadius() + ")";
    }

    public Location() {
    }

    public Location(Float latitude, Float longitude, Float horizontalAccuracy, Integer livePeriod, Integer heading, Integer proximityAlertRadius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontalAccuracy = horizontalAccuracy;
        this.livePeriod = livePeriod;
        this.heading = heading;
        this.proximityAlertRadius = proximityAlertRadius;
    }
}
