package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettlementInstructions {

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("PaymentInstructions")
    private String paymentInstructions;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    public void setPaymentInstructions(String paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SettlementDetail{");
        sb.append("currency='").append(currency).append('\'');
        sb.append(", paymentInstructions='").append(paymentInstructions).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
