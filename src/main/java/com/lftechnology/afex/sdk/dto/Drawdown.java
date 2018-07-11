package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Drawdown {

    @NotNull
    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @NotNull
    @JsonProperty("Currency")
    private String currency;

    @NotNull
    @JsonProperty("ForwardNumber")
    private String forwardNumber;

    @JsonProperty("POPCode")
    private String popCode;

    @NotNull
    @JsonProperty("PurposeOfPayment")
    private String purposeOfPayment;

    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("VendorId")
    private String vendorId;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getForwardNumber() {
        return forwardNumber;
    }

    public void setForwardNumber(String forwardNumber) {
        this.forwardNumber = forwardNumber;
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

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Drawdown{");
        sb.append("amount='").append(amount).append('\'');
        sb.append(", accountNumber=").append(accountNumber).append('\'');
        sb.append(", currency=").append(currency).append('\'');
        sb.append(", forwardNumber=").append(forwardNumber).append('\'');
        sb.append(", popCode=").append(popCode).append('\'');
        sb.append(", purposeOfPayment=").append(purposeOfPayment).append('\'');
        sb.append(", valueDate=").append(valueDate).append('\'');
        sb.append(", vendorId=").append(vendorId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
