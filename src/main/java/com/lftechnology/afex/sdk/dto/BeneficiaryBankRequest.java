package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficiaryBankRequest {

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Institution")
    private String institution;

    @JsonProperty("SWIFTBIC")
    private String swiftbic;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getSwiftbic() {
        return swiftbic;
    }

    public void setSwiftbic(String swiftbic) {
        this.swiftbic = swiftbic;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BeneficiaryBankRequest{");
        sb.append("countryCode='").append(countryCode).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", institution='").append(institution).append('\'');
        sb.append(", swiftbic='").append(swiftbic).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
