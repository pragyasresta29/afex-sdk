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

    @JsonProperty("TradeNumber")
    private String tradeNumber;

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

    public String getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(String tradeNumber) {
        this.tradeNumber = tradeNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TradeDetail{");
        sb.append("balance=").append(balance);
        sb.append(", tradeDate='").append(tradeDate).append('\'');
        sb.append(", credit='").append(credit).append('\'');
        sb.append(", debit='").append(debit).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", tradeNumber='").append(tradeNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
