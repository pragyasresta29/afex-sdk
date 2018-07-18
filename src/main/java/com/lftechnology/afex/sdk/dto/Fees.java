package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Fees {

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("SettlementCcy")
    private String settlementCcy;

    @JsonProperty("TradeCcy")
    private String tradeCcy;

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

    public String getSettlementCcy() {
        return settlementCcy;
    }

    public void setSettlementCcy(String settlementCcy) {
        this.settlementCcy = settlementCcy;
    }

    public String getTradeCcy() {
        return tradeCcy;
    }

    public void setTradeCcy(String tradeCcy) {
        this.tradeCcy = tradeCcy;
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
        final StringBuilder sb = new StringBuilder("Fees{");
        sb.append("amount='").append(amount).append('\'');
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append(", settlementCcy='").append(settlementCcy).append('\'');
        sb.append(", tradeCcy='").append(tradeCcy).append('\'');
        sb.append(", vendorId='").append(vendorId).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
