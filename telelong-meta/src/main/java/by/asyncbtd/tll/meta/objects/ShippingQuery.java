package by.asyncbtd.tll.meta.objects;

public class ShippingQuery {

    private String id;
    private User from;
    private String invoicePayload;
    private ShippingAddress shippingAddress;

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "ShippingQuery(id=" + this.getId() +
                ", from=" + this.getFrom() +
                ", invoicePayload=" + this.getInvoicePayload() +
                ", shippingAddress=" + this.getShippingAddress() + ")";
    }

    public ShippingQuery() {
    }

    public ShippingQuery(String id, User from, String invoicePayload, ShippingAddress shippingAddress) {
        this.id = id;
        this.from = from;
        this.invoicePayload = invoicePayload;
        this.shippingAddress = shippingAddress;
    }
}
