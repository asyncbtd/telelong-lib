package by.asyncbtd.tll.meta.objects;

public class RefundedPayment {

    private String currency;
    private Integer totalAmount;
    private String invoicePayload;
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

    public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
    }

    public void setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
    }

    public String toString() {
        return "RefundedPayment(currency=" + this.getCurrency() +
                ", totalAmount=" + this.getTotalAmount() +
                ", invoicePayload=" + this.getInvoicePayload() +
                ", telegramPaymentChargeId=" + this.getTelegramPaymentChargeId() +
                ", providerPaymentChargeId=" + this.getProviderPaymentChargeId() + ")";
    }

    public RefundedPayment() {
    }

    public RefundedPayment(String currency, Integer totalAmount, String invoicePayload, String telegramPaymentChargeId, String providerPaymentChargeId) {
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.invoicePayload = invoicePayload;
        this.telegramPaymentChargeId = telegramPaymentChargeId;
        this.providerPaymentChargeId = providerPaymentChargeId;
    }
}
