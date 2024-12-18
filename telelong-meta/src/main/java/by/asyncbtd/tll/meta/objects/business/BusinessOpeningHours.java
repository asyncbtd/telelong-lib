package by.asyncbtd.tll.meta.objects.business;

import java.util.List;

public class BusinessOpeningHours {

    private String timeZoneName;
    private List<BusinessOpeningHoursInterval> openingHours;

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public List<BusinessOpeningHoursInterval> getOpeningHours() {
        return openingHours;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public void setOpeningHours(List<BusinessOpeningHoursInterval> openingHours) {
        this.openingHours = openingHours;
    }

    public String toString() {
        return "BusinessOpeningHours(timeZoneName=" + this.getTimeZoneName() +
                ", openingHours=" + this.getOpeningHours() + ")";
    }

    public BusinessOpeningHours() {
    }

    public BusinessOpeningHours(String timeZoneName, List<BusinessOpeningHoursInterval> openingHours) {
        this.timeZoneName = timeZoneName;
        this.openingHours = openingHours;
    }
}
