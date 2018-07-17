package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorporateClient {

    @JsonProperty(value = "AccountNumber")
    private String accountNumber;
    
    @JsonProperty(value = "AccountPrimaryIdentificationExpirationDate", required = true)
    private String accountPrimaryIdentificationExpirationDate;

    @JsonProperty(value = "AccountPrimaryIdentificationIssueDate")
    private String accountPrimaryIdentificationIssueDate;

    @JsonProperty(value = "AccountPrimaryIdentificationIssuer")
    private String accountPrimaryIdentificationIssuer;

    @JsonProperty(value = "AccountPrimaryIdentificationNumber", required = true)
    private String accountPrimaryIdentificationNumber;

    @JsonProperty(value = "AccountPrimaryIdentificationType", required = true)
    private String accountPrimaryIdentificationType;

    @JsonProperty(value = "BusinessAddress1", required = true)
    private String businessAddress1;

    @JsonProperty(value = "BusinessAddress2")
    private String businessAddress2;

    @JsonProperty(value = "BusinessAddress3")
    private String businessAddress3;

    @JsonProperty(value = "BusinessCity", required = true)
    private String businessCity;

    @JsonProperty(value = "businessCountryCode")
    private String businessCountryCode;

    @JsonProperty(value = "BusinessName", required = true)
    private String businessName;

    @JsonProperty(value = "BusinessStateRegion")
    private String businessStateRegion;

    @JsonProperty(value = "BusinessZip", required = true)
    private String businessZip;

    @JsonProperty(value = "Citizenship")
    private String citizenship;

    @JsonProperty(value = "CompanyType", required = true)
    private String companyType;

    @JsonProperty(value = "ContactAddress1")
    private String contactAddress1;

    @JsonProperty(value = "ContactAddress2")
    private String contactAddress2;

    @JsonProperty(value = "ContactAddress3")
    private String contactAddress3;

    @JsonProperty(value = "ContactBusinessPhone", required = true)
    private String contactBusinessPhone;

    @JsonProperty(value = "ContactCity")
    private String contactCity;

    @JsonProperty(value = "ContactCountryCode")
    private String contactCountryCode;

    @JsonProperty(value = "ContactPrimaryIdentificationExpirationDate")
    private String contactPrimaryIdentificationExpirationDate;

    @JsonProperty(value = "ContactPrimaryIdentificationIssuingAgency")
    private String contactPrimaryIdentificationIssuingAgency;

    @JsonProperty(value = "ContactPrimaryIdentificationNumber")
    private String contactPrimaryIdentificationNumber;

    @JsonProperty(value = "ContactPrimaryIdentificationType")
    private String contactPrimaryIdentificationType;

    @JsonProperty(value = "ContactStateRegion")
    private String contactStateRegion;

    @JsonProperty(value = "ContactZip")
    private String contactZip;

    @JsonProperty(value = "CountryOfIncorporation")
    private String countryOfIncorporation;

    @JsonProperty(value = "DateOfBirth")
    private String dateOfBirth;

    @JsonProperty(value = "DateOfIncorporation", required = true)
    private String dateOfIncorporation;

    @JsonProperty(value = "ExpectedMonthlyPayments")
    private String expectedMonthlyPayments;

    @JsonProperty(value = "ExpectedMonthlyVolume")
    private String expectedMonthlyVolume;

    @JsonProperty(value = "FirstName", required = true)
    private String firstName;

    @JsonProperty(value = "Gender", required = true)
    private String gender;

    @JsonProperty(value = "Image")
    private String image;

    @JsonProperty(value = "ImageType")
    private String imageType;

    @JsonProperty(value = "JobTitle")
    private String jobTitle;

    @JsonProperty(value = "LastName", required = true)
    private String lastName;

    @JsonProperty(value = "MiddleName")
    private String middleName;

    @JsonProperty(value = "NAICS")
    private String naics;

    @JsonProperty(value = "NumberOfEmployees")
    private String numberOfEmployees;

    @JsonProperty(value = "PrimaryEmailAddress", required = true)
    private String primaryEmailAddress;

    @JsonProperty(value = "SecondaryIdentificationExpirationDate")
    private String secondaryIdentificationExpirationDate;

    @JsonProperty(value = "SecondaryIdentificationIssueDate")
    private String secondaryIdentificationIssueDate;

    @JsonProperty(value = "SecondaryIdentificationIssuer")
    private String secondaryIdentificationIssuer;

    @JsonProperty(value = "SecondaryIdentificationNumber")
    private String secondaryIdentificationNumber;

    @JsonProperty(value = "SecondaryIdentificationType")
    private String secondaryIdentificationType;

    @JsonProperty(value = "SubdivisionOfIncorporation")
    private String subdivisionOfIncorporation;

    @JsonProperty(value = "TaxIdentificationNumber")
    private String taxIdentificationNumber;

    @JsonProperty(value = "TermsAndConditions", required = true)
    private String termsAndConditions;

    @JsonProperty(value = "TickerSymbol")
    private String tickerSymbol;

    @JsonProperty(value = "TradeName")
    private String tradeName;

    @JsonProperty(value = "Website")
    private String website;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountPrimaryIdentificationExpirationDate() {
        return accountPrimaryIdentificationExpirationDate;
    }

    public void setAccountPrimaryIdentificationExpirationDate(String accountPrimaryIdentificationExpirationDate) {
        this.accountPrimaryIdentificationExpirationDate = accountPrimaryIdentificationExpirationDate;
    }

    public String getAccountPrimaryIdentificationIssueDate() {
        return accountPrimaryIdentificationIssueDate;
    }

    public void setAccountPrimaryIdentificationIssueDate(String accountPrimaryIdentificationIssueDate) {
        this.accountPrimaryIdentificationIssueDate = accountPrimaryIdentificationIssueDate;
    }

    public String getAccountPrimaryIdentificationIssuer() {
        return accountPrimaryIdentificationIssuer;
    }

    public void setAccountPrimaryIdentificationIssuer(String accountPrimaryIdentificationIssuer) {
        this.accountPrimaryIdentificationIssuer = accountPrimaryIdentificationIssuer;
    }

    public String getAccountPrimaryIdentificationNumber() {
        return accountPrimaryIdentificationNumber;
    }

    public void setAccountPrimaryIdentificationNumber(String accountPrimaryIdentificationNumber) {
        this.accountPrimaryIdentificationNumber = accountPrimaryIdentificationNumber;
    }

    public String getAccountPrimaryIdentificationType() {
        return accountPrimaryIdentificationType;
    }

    public void setAccountPrimaryIdentificationType(String accountPrimaryIdentificationType) {
        this.accountPrimaryIdentificationType = accountPrimaryIdentificationType;
    }

    public String getBusinessAddress1() {
        return businessAddress1;
    }

    public void setBusinessAddress1(String businessAddress1) {
        this.businessAddress1 = businessAddress1;
    }

    public String getBusinessAddress2() {
        return businessAddress2;
    }

    public void setBusinessAddress2(String businessAddress2) {
        this.businessAddress2 = businessAddress2;
    }

    public String getBusinessAddress3() {
        return businessAddress3;
    }

    public void setBusinessAddress3(String businessAddress3) {
        this.businessAddress3 = businessAddress3;
    }

    public String getBusinessCity() {
        return businessCity;
    }

    public void setBusinessCity(String businessCity) {
        this.businessCity = businessCity;
    }

    public String getBusinessCountryCode() {
        return businessCountryCode;
    }

    public void setBusinessCountryCode(String businessCountryCode) {
        this.businessCountryCode = businessCountryCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessStateRegion() {
        return businessStateRegion;
    }

    public void setBusinessStateRegion(String businessStateRegion) {
        this.businessStateRegion = businessStateRegion;
    }

    public String getBusinessZip() {
        return businessZip;
    }

    public void setBusinessZip(String businessZip) {
        this.businessZip = businessZip;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getContactAddress1() {
        return contactAddress1;
    }

    public void setContactAddress1(String contactAddress1) {
        this.contactAddress1 = contactAddress1;
    }

    public String getContactAddress2() {
        return contactAddress2;
    }

    public void setContactAddress2(String contactAddress2) {
        this.contactAddress2 = contactAddress2;
    }

    public String getContactAddress3() {
        return contactAddress3;
    }

    public void setContactAddress3(String contactAddress3) {
        this.contactAddress3 = contactAddress3;
    }

    public String getContactBusinessPhone() {
        return contactBusinessPhone;
    }

    public void setContactBusinessPhone(String contactBusinessPhone) {
        this.contactBusinessPhone = contactBusinessPhone;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactCountryCode() {
        return contactCountryCode;
    }

    public void setContactCountryCode(String contactCountryCode) {
        this.contactCountryCode = contactCountryCode;
    }

    public String getContactPrimaryIdentificationExpirationDate() {
        return contactPrimaryIdentificationExpirationDate;
    }

    public void setContactPrimaryIdentificationExpirationDate(String contactPrimaryIdentificationExpirationDate) {
        this.contactPrimaryIdentificationExpirationDate = contactPrimaryIdentificationExpirationDate;
    }

    public String getContactPrimaryIdentificationIssuingAgency() {
        return contactPrimaryIdentificationIssuingAgency;
    }

    public void setContactPrimaryIdentificationIssuingAgency(String contactPrimaryIdentificationIssuingAgency) {
        this.contactPrimaryIdentificationIssuingAgency = contactPrimaryIdentificationIssuingAgency;
    }

    public String getContactPrimaryIdentificationNumber() {
        return contactPrimaryIdentificationNumber;
    }

    public void setContactPrimaryIdentificationNumber(String contactPrimaryIdentificationNumber) {
        this.contactPrimaryIdentificationNumber = contactPrimaryIdentificationNumber;
    }

    public String getContactPrimaryIdentificationType() {
        return contactPrimaryIdentificationType;
    }

    public void setContactPrimaryIdentificationType(String contactPrimaryIdentificationType) {
        this.contactPrimaryIdentificationType = contactPrimaryIdentificationType;
    }

    public String getContactStateRegion() {
        return contactStateRegion;
    }

    public void setContactStateRegion(String contactStateRegion) {
        this.contactStateRegion = contactStateRegion;
    }

    public String getContactZip() {
        return contactZip;
    }

    public void setContactZip(String contactZip) {
        this.contactZip = contactZip;
    }

    public String getCountryOfIncorporation() {
        return countryOfIncorporation;
    }

    public void setCountryOfIncorporation(String countryOfIncorporation) {
        this.countryOfIncorporation = countryOfIncorporation;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfIncorporation() {
        return dateOfIncorporation;
    }

    public void setDateOfIncorporation(String dateOfIncorporation) {
        this.dateOfIncorporation = dateOfIncorporation;
    }

    public String getExpectedMonthlyPayments() {
        return expectedMonthlyPayments;
    }

    public void setExpectedMonthlyPayments(String expectedMonthlyPayments) {
        this.expectedMonthlyPayments = expectedMonthlyPayments;
    }

    public String getExpectedMonthlyVolume() {
        return expectedMonthlyVolume;
    }

    public void setExpectedMonthlyVolume(String expectedMonthlyVolume) {
        this.expectedMonthlyVolume = expectedMonthlyVolume;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    public void setPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
    }

    public String getSecondaryIdentificationExpirationDate() {
        return secondaryIdentificationExpirationDate;
    }

    public void setSecondaryIdentificationExpirationDate(String secondaryIdentificationExpirationDate) {
        this.secondaryIdentificationExpirationDate = secondaryIdentificationExpirationDate;
    }

    public String getSecondaryIdentificationIssueDate() {
        return secondaryIdentificationIssueDate;
    }

    public void setSecondaryIdentificationIssueDate(String secondaryIdentificationIssueDate) {
        this.secondaryIdentificationIssueDate = secondaryIdentificationIssueDate;
    }

    public String getSecondaryIdentificationIssuer() {
        return secondaryIdentificationIssuer;
    }

    public void setSecondaryIdentificationIssuer(String secondaryIdentificationIssuer) {
        this.secondaryIdentificationIssuer = secondaryIdentificationIssuer;
    }

    public String getSecondaryIdentificationNumber() {
        return secondaryIdentificationNumber;
    }

    public void setSecondaryIdentificationNumber(String secondaryIdentificationNumber) {
        this.secondaryIdentificationNumber = secondaryIdentificationNumber;
    }

    public String getSecondaryIdentificationType() {
        return secondaryIdentificationType;
    }

    public void setSecondaryIdentificationType(String secondaryIdentificationType) {
        this.secondaryIdentificationType = secondaryIdentificationType;
    }

    public String getSubdivisionOfIncorporation() {
        return subdivisionOfIncorporation;
    }

    public void setSubdivisionOfIncorporation(String subdivisionOfIncorporation) {
        this.subdivisionOfIncorporation = subdivisionOfIncorporation;
    }

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CorporateClient{");
        sb.append("accountNumber='").append(accountNumber).append('\'');
        sb.append("accountPrimaryIdentificationExpirationDate='").append(accountPrimaryIdentificationExpirationDate).append('\'');
        sb.append("accountPrimaryIdentificationIssueDate='").append(accountPrimaryIdentificationIssueDate).append('\'');
        sb.append("accountPrimaryIdentificationIssuer='").append(accountPrimaryIdentificationIssuer).append('\'');
        sb.append("accountPrimaryIdentificationNumber='").append(accountPrimaryIdentificationNumber).append('\'');
        sb.append("accountPrimaryIdentificationType='").append(accountPrimaryIdentificationType).append('\'');
        sb.append("businessAddress1='").append(businessAddress1).append('\'');
        sb.append("businessAddress2='").append(businessAddress2).append('\'');
        sb.append("businessAddress3='").append(businessAddress3).append('\'');
        sb.append("businessCity='").append(businessCity).append('\'');
        sb.append("businessCountryCode='").append(businessCountryCode).append('\'');
        sb.append("businessName='").append(businessName).append('\'');
        sb.append("businessStateRegion='").append(businessStateRegion).append('\'');
        sb.append("businessZip='").append(businessZip).append('\'');
        sb.append("citizenship='").append(citizenship).append('\'');
        sb.append("companyType='").append(companyType).append('\'');
        sb.append(", contactAddress1=").append(contactAddress1).append('\'');
        sb.append(", contactAddress2=").append(contactAddress2).append('\'');
        sb.append(", contactAddress3=").append(contactAddress3).append('\'');
        sb.append(", contactBusinessPhone=").append(contactBusinessPhone).append('\'');
        sb.append(", contactCity=").append(contactCity).append('\'');
        sb.append(", contactCountryCode=").append(contactCountryCode).append('\'');
        sb.append(", contactPrimaryIdentificationExpirationDate=").append(contactPrimaryIdentificationExpirationDate).append('\'');
        sb.append(", contactPrimaryIdentificationIssuingAgency=").append(contactPrimaryIdentificationIssuingAgency).append('\'');
        sb.append(", contactPrimaryIdentificationNumber=").append(contactPrimaryIdentificationNumber).append('\'');
        sb.append(", contactPrimaryIdentificationType=").append(contactPrimaryIdentificationType).append('\'');
        sb.append(", contactStateRegion=").append(contactStateRegion).append('\'');
        sb.append(", contactZip=").append(contactZip).append('\'');
        sb.append(", countryOfIncorporation=").append(countryOfIncorporation).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth).append('\'');
        sb.append(", expectedMonthlyPayments=").append(expectedMonthlyPayments).append('\'');
        sb.append(", expectedMonthlyVolume=").append(expectedMonthlyVolume).append('\'');
        sb.append(", firstName=").append(firstName).append('\'');
        sb.append(", gender=").append(gender).append('\'');
        sb.append(", image=").append(image).append('\'');
        sb.append(", imageType=").append(imageType).append('\'');
        sb.append(", jobTitle=").append(jobTitle).append('\'');
        sb.append(", lastName=").append(lastName).append('\'');
        sb.append(", middleName=").append(middleName).append('\'');
        sb.append(", naics=").append(naics).append('\'');
        sb.append(", numberOfEmployees=").append(numberOfEmployees).append('\'');
        sb.append(", primaryEmailAddress=").append(primaryEmailAddress).append('\'');
        sb.append(", secondaryIdentificationExpirationDate=").append(secondaryIdentificationExpirationDate).append('\'');
        sb.append(", secondaryIdentificationIssueDate=").append(secondaryIdentificationIssueDate).append('\'');
        sb.append(", secondaryIdentificationIssuer=").append(secondaryIdentificationIssuer).append('\'');
        sb.append(", secondaryIdentificationNumber=").append(secondaryIdentificationNumber).append('\'');
        sb.append(", secondaryIdentificationType=").append(secondaryIdentificationType).append('\'');
        sb.append(", subdivisionOfIncorporation=").append(subdivisionOfIncorporation).append('\'');
        sb.append(", taxIdentificationNumber=").append(taxIdentificationNumber).append('\'');
        sb.append(", termsAndConditions=").append(termsAndConditions).append('\'');
        sb.append(", tickerSymbol=").append(tickerSymbol).append('\'');
        sb.append(", tradeName=").append(tradeName).append('\'');
        sb.append(", website=").append(website).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
