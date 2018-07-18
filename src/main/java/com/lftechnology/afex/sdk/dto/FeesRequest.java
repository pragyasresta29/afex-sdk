package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeesRequest {

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("SettlementCcy")
    private String settlementCurrency;

    @JsonProperty("TradeCcy")
    private String tradeCurrency;

    @JsonProperty("VendorId")
    private String vendorId;

    @JsonProperty("ValueDate")
    private String valueDate;

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

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FeesRequest{");
        sb.append("amount='").append(amount).append('\'');
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", settlementCurrency='").append(settlementCurrency).append('\'');
        sb.append(", tradeCurrency='").append(tradeCurrency).append('\'');
        sb.append(", vendorId='").append(vendorId).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
