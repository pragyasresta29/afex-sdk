package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankRequest {

    @JsonProperty("City")
    private String city;

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("Institution")
    private String institution;

    @JsonProperty("NationalID")
    private String nationalID;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BankRequest{");
        sb.append("city='").append(city).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", institution='").append(institution).append('\'');
        sb.append(", nationalID='").append(nationalID).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
