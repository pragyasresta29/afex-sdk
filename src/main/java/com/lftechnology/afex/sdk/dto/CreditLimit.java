package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditLimit {

    /**
     *  Client’s approved maximum limit for aggregated unsettled cash, tom and spot transactions.
     */
    @JsonProperty("SpotLimit")
    private BigDecimal spotLimit;

    /**
     *  SpotLimit less total unsettled cash/tom/spot trades booked. Amount available to the client
     *  out of the spot limit to book new cash/tom/spot trades.
     */
    @JsonProperty("AvailableSpotLimit")
    private BigDecimal availableSpotLimit;

    /**
     *  Client’s approved limit for aggregated unsettled outright and window forward transactions.
     */
    @JsonProperty("ForwardLimit")
    private BigDecimal forwardLimit;

    /**
     *  Forward limit less unsettled forwards booked. Amount available to the client out of the
     *  forward limit to book new forward trades.
     */
    @JsonProperty("AvailableForwardLimit")
    private BigDecimal availableForwardLimit;

    public BigDecimal getSpotLimit() {
        return spotLimit;
    }

    public void setSpotLimit(BigDecimal spotLimit) {
        this.spotLimit = spotLimit;
    }

    public BigDecimal getAvailableSpotLimit() {
        return availableSpotLimit;
    }

    public void setAvailableSpotLimit(BigDecimal availableSpotLimit) {
        this.availableSpotLimit = availableSpotLimit;
    }

    public BigDecimal getForwardLimit() {
        return forwardLimit;
    }

    public void setForwardLimit(BigDecimal forwardLimit) {
        this.forwardLimit = forwardLimit;
    }

    public BigDecimal getAvailableForwardLimit() {
        return availableForwardLimit;
    }

    public void setAvailableForwardLimit(BigDecimal availableForwardLimit) {
        this.availableForwardLimit = availableForwardLimit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditLimit{");
        sb.append("spotLimit=").append(spotLimit);
        sb.append(", availableSpotLimit=").append(availableSpotLimit);
        sb.append(", forwardLimit=").append(forwardLimit);
        sb.append(", availableForwardLimit=").append(availableForwardLimit);
        sb.append('}');
        return sb.toString();
    }
}
