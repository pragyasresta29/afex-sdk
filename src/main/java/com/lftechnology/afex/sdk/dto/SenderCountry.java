package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SenderCountry {

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("CountryName")
    private String countryName;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CountryResponse{");
        sb.append("countryCode='").append(countryCode).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
