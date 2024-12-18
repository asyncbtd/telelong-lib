package by.asyncbtd.tll.meta.objects.paid;

import by.asyncbtd.tll.meta.objects.User;

public class PaidMediaPurchased {

    private User from;
    private String paidMediaPayload;

    public User getFrom() {
        return from;
    }

    public String getPaidMediaPayload() {
        return paidMediaPayload;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setPaidMediaPayload(String paidMediaPayload) {
        this.paidMediaPayload = paidMediaPayload;
    }

    public String toString() {
        return "PaidMediaPurchased(from=" + this.getFrom() +
                ", paidMediaPayload=" + this.getPaidMediaPayload() + ")";
    }

    public PaidMediaPurchased() {
    }

    public PaidMediaPurchased(User from, String paidMediaPayload) {
        this.from = from;
        this.paidMediaPayload = paidMediaPayload;
    }
}
