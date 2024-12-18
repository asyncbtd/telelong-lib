package by.asyncbtd.tll.meta.objects;

public class SuccessfulPayment {

    private String currency;
    private Integer totalAmount;
    private String invoicePayload;
    private String shippingOptionId;
    private OrderInfo orderInfo;
    private String telegramPaymentChargeId;
    private String providerPaymentChargeId;

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

    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
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

    public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
    }

    public void setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
    }

    public String toString() {
        return "SuccessfulPayment(currency=" + this.getCurrency() +
                ", totalAmount=" + this.getTotalAmount() +
                ", invoicePayload=" + this.getInvoicePayload() +
                ", shippingOptionId=" + this.getShippingOptionId() +
                ", orderInfo=" + this.getOrderInfo() +
                ", telegramPaymentChargeId=" + this.getTelegramPaymentChargeId() +
                ", providerPaymentChargeId=" + this.getProviderPaymentChargeId() + ")";
    }

    public SuccessfulPayment() {
    }

    public SuccessfulPayment(String currency, Integer totalAmount, String invoicePayload, String shippingOptionId, OrderInfo orderInfo, String telegramPaymentChargeId,
                             String providerPaymentChargeId) {
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.invoicePayload = invoicePayload;
        this.shippingOptionId = shippingOptionId;
        this.orderInfo = orderInfo;
        this.telegramPaymentChargeId = telegramPaymentChargeId;
        this.providerPaymentChargeId = providerPaymentChargeId;
    }
}
