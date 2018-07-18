package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentResponse {

    @JsonProperty("ReferenceNumber")
    private Integer referenceNumber;

    @JsonProperty("Amount")
    private Integer amount;

    @JsonProperty("Ccy")
    private String currency;

    @JsonProperty("PaymentDate")
    private String paymentDate;

    public Integer getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Integer referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentDetail{");
        sb.append("referenceNumber=").append(referenceNumber);
        sb.append(", amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", paymentDate='").append(paymentDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
