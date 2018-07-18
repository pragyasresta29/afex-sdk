package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntermediaryBankDetail {

    @JsonProperty("Address1")
    private String address1;

    @JsonProperty("Address2")
    private String address2;

    @JsonProperty("Address3")
    private String address3;

    @JsonProperty("Address4")
    private String address4;

    @JsonProperty("BIC")
    private String bic;

    @JsonProperty("BranchCode")
    private String branchCode;

    @JsonProperty("BranchName")
    private String branchName;

    @JsonProperty("CityHeading")
    private String cityHeading;

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("InstitutionName")
    private String institutionName;

    @JsonProperty("PostalCode")
    private String postalCode;

    @JsonProperty("POBox")
    private String poBox;

    @JsonProperty("CountryName")
    private String countryName;

    @JsonProperty("RecordKey")
    private String recordKey;

    @JsonProperty("ParentOfficeKey")
    private String parentOfficeKey;

    @JsonProperty("HasParent")
    private boolean hasParent;

    @JsonProperty("NationalId")
    private String nationalId;

    @JsonProperty("RoutingType")
    private String routingType;

    @JsonProperty("IsACHConnected")
    private boolean isAchConnected;

    @JsonProperty("IsFedwireConnected")
    private boolean isFedwireConnected;

    @JsonProperty("OverrideRoutingCode")
    private String overrideRoutingCode;

    @JsonProperty("IsMultBanks")
    private boolean isMultBanks;

    @JsonProperty("IsMultInterBanks")
    private boolean isMultInterBanks;

    @JsonProperty("IntermediaryBanks")
    private List<Object> intermediaryBanks = null;

    @JsonProperty("intermBanks")
    private Object intermBanks;

    @JsonProperty("BrokenRuleResult")
    private BrokenRuleResult brokenRuleResult;

    @JsonProperty("IsValid")
    private boolean isValid;

    @JsonProperty("Error")
    private String error;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCityHeading() {
        return cityHeading;
    }

    public void setCityHeading(String cityHeading) {
        this.cityHeading = cityHeading;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRecordKey() {
        return recordKey;
    }

    public void setRecordKey(String recordKey) {
        this.recordKey = recordKey;
    }

    public String getParentOfficeKey() {
        return parentOfficeKey;
    }

    public void setParentOfficeKey(String parentOfficeKey) {
        this.parentOfficeKey = parentOfficeKey;
    }

    public boolean isHasParent() {
        return hasParent;
    }

    public void setHasParent(boolean hasParent) {
        this.hasParent = hasParent;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getRoutingType() {
        return routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public boolean isAchConnected() {
        return isAchConnected;
    }

    public void setAchConnected(boolean achConnected) {
        isAchConnected = achConnected;
    }

    public boolean isFedwireConnected() {
        return isFedwireConnected;
    }

    public void setFedwireConnected(boolean fedwireConnected) {
        isFedwireConnected = fedwireConnected;
    }

    public String getOverrideRoutingCode() {
        return overrideRoutingCode;
    }

    public void setOverrideRoutingCode(String overrideRoutingCode) {
        this.overrideRoutingCode = overrideRoutingCode;
    }

    public boolean isMultBanks() {
        return isMultBanks;
    }

    public void setMultBanks(boolean multBanks) {
        isMultBanks = multBanks;
    }

    public boolean isMultInterBanks() {
        return isMultInterBanks;
    }

    public void setMultInterBanks(boolean multInterBanks) {
        isMultInterBanks = multInterBanks;
    }

    public List<Object> getIntermediaryBanks() {
        return intermediaryBanks;
    }

    public void setIntermediaryBanks(List<Object> intermediaryBanks) {
        this.intermediaryBanks = intermediaryBanks;
    }

    public Object getIntermBanks() {
        return intermBanks;
    }

    public void setIntermBanks(Object intermBanks) {
        this.intermBanks = intermBanks;
    }

    public BrokenRuleResult getBrokenRuleResult() {
        return brokenRuleResult;
    }

    public void setBrokenRuleResult(BrokenRuleResult brokenRuleResult) {
        this.brokenRuleResult = brokenRuleResult;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IntermediaryBankDetails{");
        sb.append("address1='").append(address1).append('\'');
        sb.append(", address2='").append(address2).append('\'');
        sb.append(", address3='").append(address3).append('\'');
        sb.append(", address4='").append(address4).append('\'');
        sb.append(", bic='").append(bic).append('\'');
        sb.append(", branchCode='").append(branchCode).append('\'');
        sb.append(", branchName='").append(branchName).append('\'');
        sb.append(", cityHeading='").append(cityHeading).append('\'');
        sb.append(", countryCode='").append(countryCode).append('\'');
        sb.append(", institutionName='").append(institutionName).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", poBox='").append(poBox).append('\'');
        sb.append(", countryName='").append(countryName).append('\'');
        sb.append(", recordKey='").append(recordKey).append('\'');
        sb.append(", parentOfficeKey='").append(parentOfficeKey).append('\'');
        sb.append(", hasParent=").append(hasParent);
        sb.append(", nationalId='").append(nationalId).append('\'');
        sb.append(", routingType='").append(routingType).append('\'');
        sb.append(", isAchConnected=").append(isAchConnected);
        sb.append(", isFedwireConnected=").append(isFedwireConnected);
        sb.append(", overrideRoutingCode='").append(overrideRoutingCode).append('\'');
        sb.append(", isMultBanks=").append(isMultBanks);
        sb.append(", isMultInterBanks=").append(isMultInterBanks);
        sb.append(", intermediaryBanks=").append(intermediaryBanks);
        sb.append(", intermBanks=").append(intermBanks);
        sb.append(", brokenRuleResult=").append(brokenRuleResult);
        sb.append(", isValid=").append(isValid);
        sb.append(", error='").append(error).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
