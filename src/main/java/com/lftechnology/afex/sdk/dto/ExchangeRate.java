package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeRate {

    /**
     * The indicative rate for the currency trade.
     */
    @JsonProperty("Rate")
    private Double rate;

    /**
     * The indicative inverted rate for the currency trade.
     */
    @JsonProperty("InvertedRate")
    private Double invertedRate;

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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getInvertedRate() {
        return invertedRate;
    }

    public void setInvertedRate(Double invertedRate) {
        this.invertedRate = invertedRate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rate{");
        sb.append("rate=").append(rate);
        sb.append(", invertedRate=").append(invertedRate);
        sb.append(", terms='").append(terms).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
