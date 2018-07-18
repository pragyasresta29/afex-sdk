package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Forward {

    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("IsAmountSettlement")
    private String isAmountSettlement;

    @JsonProperty("Note")
    private String note;

    @JsonProperty("QuoteId")
    private String quoteId;

    @JsonProperty(value = "SettlementCcy", required = true)
    private String settlementCcy;

    @JsonProperty(value = "TradeCcy", required = true)
    private String tradeCcy;

    @JsonProperty(value = "OptionDate", required = true)
    private String optionDate;

    @JsonProperty(value = "ValueDate", required = true)
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

    public String getIsAmountSettlement() {
        return isAmountSettlement;
    }

    public void setIsAmountSettlement(String isAmountSettlement) {
        this.isAmountSettlement = isAmountSettlement;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
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

    public String getOptionDate() {
        return optionDate;
    }

    public void setOptionDate(String optionDate) {
        this.optionDate = optionDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Forward{");
        sb.append("amount='").append(amount).append('\'');
        sb.append(", accountNumber=").append(accountNumber).append('\'');
        sb.append(", isAmountSettlement=").append(isAmountSettlement).append('\'');
        sb.append(", note=").append(note).append('\'');
        sb.append(", settlementCcy=").append(quoteId).append('\'');
        sb.append(", settlementCcy=").append(settlementCcy).append('\'');
        sb.append(", tradeCcy=").append(tradeCcy).append('\'');
        sb.append(", optionDate=").append(optionDate).append('\'');
        sb.append(", valueDate=").append(valueDate).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
