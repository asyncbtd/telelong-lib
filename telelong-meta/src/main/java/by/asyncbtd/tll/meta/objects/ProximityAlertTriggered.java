package by.asyncbtd.tll.meta.objects;

public class ProximityAlertTriggered {

    private User traveler;
    private User watcher;
    private Integer distance;

    public User getTraveler() {
        return traveler;
    }

    public User getWatcher() {
        return watcher;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setTraveler(User traveler) {
        this.traveler = traveler;
    }

    public void setWatcher(User watcher) {
        this.watcher = watcher;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String toString() {
        return "ProximityAlertTriggered(traveler=" + this.getTraveler() +
                ", watcher=" + this.getWatcher() +
                ", distance=" + this.getDistance() + ")";
    }

    public ProximityAlertTriggered() {
    }

    public ProximityAlertTriggered(User traveler, User watcher, Integer distance) {
        this.traveler = traveler;
        this.watcher = watcher;
        this.distance = distance;
    }
}
