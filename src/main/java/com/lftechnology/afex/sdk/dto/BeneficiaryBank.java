package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficiaryBank {

    @JsonProperty("NationalIdentifier")
    private String nationalIdentifier;

    @JsonProperty("NationalIdType")
    private String nationalIdType;

    @JsonProperty("InstitutionName")
    private String institutionName;

    @JsonProperty("BranchInformation")
    private String branchInformation;

    @JsonProperty("StreetAddress1")
    private String streetAddress1;

    @JsonProperty("StreetAddress2")
    private String streetAddress2;

    @JsonProperty("StreetAddress3")
    private String streetAddress3;

    @JsonProperty("StreetAddress4")
    private String streetAddress4;

    @JsonProperty("City")
    private String city;

    @JsonProperty("ZipCode")
    private String zipCode;

    @JsonProperty("CountryName")
    private String countryName;

    @JsonProperty("IsoCountryCode")
    private String isoCountryCode;

    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    public void setNationalIdentifier(String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    public String getNationalIdType() {
        return nationalIdType;
    }

    public void setNationalIdType(String nationalIdType) {
        this.nationalIdType = nationalIdType;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getBranchInformation() {
        return branchInformation;
    }

    public void setBranchInformation(String branchInformation) {
        this.branchInformation = branchInformation;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getStreetAddress3() {
        return streetAddress3;
    }

    public void setStreetAddress3(String streetAddress3) {
        this.streetAddress3 = streetAddress3;
    }

    public String getStreetAddress4() {
        return streetAddress4;
    }

    public void setStreetAddress4(String streetAddress4) {
        this.streetAddress4 = streetAddress4;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BeneficiaryBank{");
        sb.append("nationalIdentifier='").append(nationalIdentifier).append('\'');
        sb.append(", nationalIdType='").append(nationalIdType).append('\'');
        sb.append(", institutionName='").append(institutionName).append('\'');
        sb.append(", branchInformation='").append(branchInformation).append('\'');
        sb.append(", streetAddress1='").append(streetAddress1).append('\'');
        sb.append(", streetAddress2='").append(streetAddress2).append('\'');
        sb.append(", streetAddress3='").append(streetAddress3).append('\'');
        sb.append(", streetAddress4='").append(streetAddress4).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", isoCountryCode='").append(isoCountryCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
