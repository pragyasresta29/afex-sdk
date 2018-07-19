package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeRate {

    /**
     * The indicative rate for the currency trade.
     */
    @JsonProperty("Rate")
    private BigDecimal rate;

    /**
     * The indicative inverted rate for the currency trade.
     */
    @JsonProperty("InvertedRate")
    private BigDecimal invertedRate;

    /**
     * Terms define whether you need to multiply OR divide amounts the by the Rate to calculate the equivalent
     * foreign currency amount.
     *
     * Converting a Buy Amount to a Sell Amount
     * If the terms are A, multiply the buy (TradeCcy) amount by the Rate to calculate the sell currency (SettlementCcy)
     * equivalent amount. If the terms are E, divide the buy amount by the Rate to calculate the sell equivalent amount.
     * If using the InvertedRate to the reverse logic applies.
     *
     * Converting a Sell Amount to a Buy Amount
     * If converting a sell amount to a buy amount, if the terms are A, divide by the Rate, if the terms are E,
     * multiply by the Rate. If using the InvertedRate, the inverse logic applies.
     */
    @JsonProperty("Terms")
    private String terms;

    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("OptionDate")
    private String optionDate;

    /**
     *  The unique AFEX identifier for the quote. The QuoteID can be supplied in api/trades/create to fix the rate for
     *  a trade providing the trade is created before the quote expires.
     */
    @JsonProperty("QuoteId")
    private String quoteId;

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getInvertedRate() {
        return invertedRate;
    }

    public void setInvertedRate(BigDecimal invertedRate) {
        this.invertedRate = invertedRate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
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

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExchangeRate{");
        sb.append("rate=").append(rate);
        sb.append(", invertedRate=").append(invertedRate);
        sb.append(", terms='").append(terms).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append(", optionDate='").append(optionDate).append('\'');
        sb.append(", quoteId='").append(quoteId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
