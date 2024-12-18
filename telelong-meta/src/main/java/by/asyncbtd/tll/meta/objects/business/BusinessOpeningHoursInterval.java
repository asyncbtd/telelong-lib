package by.asyncbtd.tll.meta.objects.business;

public class BusinessOpeningHoursInterval {

    private Integer openingMinute;
    private Integer closingMinute;

    public Integer getOpeningMinute() {
        return openingMinute;
    }

    public Integer getClosingMinute() {
        return closingMinute;
    }

    public void setOpeningMinute(Integer openingMinute) {
        this.openingMinute = openingMinute;
    }

    public void setClosingMinute(Integer closingMinute) {
        this.closingMinute = closingMinute;
    }

    public String toString() {
        return "BusinessOpeningHoursInterval(openingMinute=" + this.getOpeningMinute() +
                ", closingMinute=" + this.getClosingMinute() + ")";
    }

    public BusinessOpeningHoursInterval() {
    }

    public BusinessOpeningHoursInterval(Integer openingMinute, Integer closingMinute) {
        this.openingMinute = openingMinute;
        this.closingMinute = closingMinute;
    }
}
