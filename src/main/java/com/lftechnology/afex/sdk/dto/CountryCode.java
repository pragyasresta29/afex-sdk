package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryCode {

    @JsonProperty("CountryCode")
    private String countryCode;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CountryCode{");
        sb.append("countryCode='").append(countryCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
