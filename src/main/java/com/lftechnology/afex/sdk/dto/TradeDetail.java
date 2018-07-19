package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TradeDetail {

    @JsonProperty("Balance")
    private BigDecimal balance;

    @JsonProperty("TradeDate")
    private String tradeDate;

    @JsonProperty("Credit")
    private String credit;

    @JsonProperty("Debit")
    private String debit;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("TradeCcy")
    private String tradeCurrency;

    @JsonProperty("SettlementCcy")
    private String settlementCurrency;

    @JsonProperty("TradeNumber")
    private Integer tradeNumber;

    @JsonProperty("Amount")
    private BigDecimal amount;

    @JsonProperty("RemainingBalance")
    private BigDecimal remainingBalance;

    @JsonProperty("Rate")
    private BigDecimal rate;

    @JsonProperty("BeneficiaryName")
    private String beneficiaryName;

    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("Status")
    private String status;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTradeCurrency() {
        return tradeCurrency;
    }

    public void setTradeCurrency(String tradeCurrency) {
        this.tradeCurrency = tradeCurrency;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public Integer getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(Integer tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(BigDecimal remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradeDetail{");
        sb.append("balance=").append(balance);
        sb.append(", tradeDate='").append(tradeDate).append('\'');
        sb.append(", credit='").append(credit).append('\'');
        sb.append(", debit='").append(debit).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", tradeCurrency='").append(tradeCurrency).append('\'');
        sb.append(", settlementCurrency='").append(settlementCurrency).append('\'');
        sb.append(", tradeNumber=").append(tradeNumber);
        sb.append(", amount=").append(amount);
        sb.append(", remainingBalance=").append(remainingBalance);
        sb.append(", rate=").append(rate);
        sb.append(", beneficiaryName='").append(beneficiaryName).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
