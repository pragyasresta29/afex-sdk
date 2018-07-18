package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ForwardDetail {

    @JsonProperty("TradeNumber")
    private Integer tradeNumber;

    @JsonProperty("RemainingBalance")
    private BigDecimal remainingBalance;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("Rate")
    private BigDecimal rate;

    @JsonProperty("TradeCcy")
    private String tradeCurrency;

    @JsonProperty("SettlementAmt")
    private BigDecimal settlementAmt;

    @JsonProperty("SettlementCcy")
    private String settlementCurrency;

    @JsonProperty("TradeDate")
    private String tradeDate;

    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("OptionDate")
    private String optionDate;

    @JsonProperty("AccountNumber")
    private Object accountNumber;

    public Integer getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(Integer tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(BigDecimal remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }

    public BigDecimal getSettlementAmt() {
        return settlementAmt;
    }

    public void setSettlementAmt(BigDecimal settlementAmt) {
        this.settlementAmt = settlementAmt;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getOptionDate() {
        return optionDate;
    }

    public void setOptionDate(String optionDate) {
        this.optionDate = optionDate;
    }

    public Object getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Object accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ForwardDetail{");
        sb.append("tradeNumber=").append(tradeNumber);
        sb.append(", amount=").append(amount);
        sb.append(", rate=").append(rate);
        sb.append(", tradeCurrency='").append(tradeCurrency).append('\'');
        sb.append(", settlementAmt=").append(settlementAmt);
        sb.append(", settlementCurrency='").append(settlementCurrency).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append(", optionDate='").append(optionDate).append('\'');
        sb.append(", accountNumber=").append(accountNumber);
        sb.append('}');
        return sb.toString();
    }
}
