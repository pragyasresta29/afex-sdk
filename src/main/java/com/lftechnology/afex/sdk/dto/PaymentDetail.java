package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDetail {

    @JsonProperty("ReferenceNumber")
    private String referenceNumber;

    @JsonProperty("PaymentStatus")
    private String paymentStatus;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("Amount")
    private Integer amount;

    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("BeneficiaryName")
    private String beneficiaryName;

    @JsonProperty("ScheduledDate")
    private String scheduledDate;

    @JsonProperty("SubmittedDate")
    private String submittedDate;

    @JsonProperty("ModifiedDate")
    private String modifiedDate;

    @JsonProperty("TradeNumber")
    private String tradeNumber;

    @JsonProperty("Status")
    private String status;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentDetail{");
        sb.append("referenceNumber='").append(referenceNumber).append('\'');
        sb.append(", paymentStatus='").append(paymentStatus).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append(", beneficiaryName='").append(beneficiaryName).append('\'');
        sb.append(", scheduledDate='").append(scheduledDate).append('\'');
        sb.append(", submittedDate='").append(submittedDate).append('\'');
        sb.append(", modifiedDate='").append(modifiedDate).append('\'');
        sb.append(", tradeNumber='").append(tradeNumber).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
