package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment {

    @JsonProperty(value = "Amount", required = true)
    private String amount;

    @JsonProperty(value = "Currency", required = true)
    private String currency;

    @JsonProperty(value = "PaymentDate", required = true)
    private String paymentDate;

    @JsonProperty("PopCode")
    private String popCode;

    @JsonProperty("PurposeOfPayment")
    private String purposeOfPayment;

    @JsonProperty(value = "VendorId", required = true)
    private String vendorId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPopCode() {
        return popCode;
    }

    public void setPopCode(String popCode) {
        this.popCode = popCode;
    }

    public String getPurposeOfPayment() {
        return purposeOfPayment;
    }

    public void setPurposeOfPayment(String purposeOfPayment) {
        this.purposeOfPayment = purposeOfPayment;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Payment{");
        sb.append("amount='").append(amount).append('\'');
        sb.append(", currency=").append(currency).append('\'');
        sb.append(", paymentDate=").append(paymentDate).append('\'');
        sb.append(", popCode=").append(popCode).append('\'');
        sb.append(", purposeOfPayment=").append(purposeOfPayment).append('\'');
        sb.append(", vendorId=").append(vendorId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
