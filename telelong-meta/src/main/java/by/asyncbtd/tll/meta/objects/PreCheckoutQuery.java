package by.asyncbtd.tll.meta.objects;

public class PreCheckoutQuery {

    private String id;
    private User from;
    private String currency;
    private Integer totalAmount;
    private String invoicePayload;
    private String shippingOptionId;
    private OrderInfo orderInfo;

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public void setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String toString() {
        return "PreCheckoutQuery(id=" + this.getId() +
                ", from=" + this.getFrom() +
                ", currency=" + this.getCurrency() +
                ", totalAmount=" + this.getTotalAmount() +
                ", invoicePayload=" + this.getInvoicePayload() +
                ", shippingOptionId=" + this.getShippingOptionId() +
                ", orderInfo=" + this.getOrderInfo() + ")";
    }

    public PreCheckoutQuery() {
    }

    public PreCheckoutQuery(String id, User from, String currency, Integer totalAmount, String invoicePayload, String shippingOptionId, OrderInfo orderInfo) {
        this.id = id;
        this.from = from;
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.invoicePayload = invoicePayload;
        this.shippingOptionId = shippingOptionId;
        this.orderInfo = orderInfo;
    }
}
