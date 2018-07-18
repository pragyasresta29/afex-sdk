package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DrawdownDetail {

    @JsonProperty("TradeNumber")
    private Integer tradeNumber;

    @JsonProperty("Amount")
    private Integer amount;

    @JsonProperty("Ccy")
    private String currency;

    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    public Integer getTradeNumber() {
        return tradeNumber;
    }

    public void setTradeNumber(Integer tradeNumber) {
        this.tradeNumber = tradeNumber;
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

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DrawdownDetail{");
        sb.append("tradeNumber=").append(tradeNumber);
        sb.append(", amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append(", accountNumber='").append(accountNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
