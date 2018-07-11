package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrivateClient {

    @NotNull
    @JsonProperty("Citizenship")
    private String citizenship;

    @NotNull
    @JsonProperty("ContactAddress1")
    private String contactAddress1;

    @JsonProperty("ContactAddress2")
    private String contactAddress2;

    @JsonProperty("ContactAddress3")
    private String contactAddress3;

    @NotNull
    @JsonProperty("ContactZip")
    private String contactZip;

    @NotNull
    @JsonProperty("ContactCity")
    private String contactCity;

    @JsonProperty("ContactStateRegion")
    private String contactStateRegion;

    @NotNull
    @JsonProperty("ContactCountryCode")
    private String contactCountryCode;

    @JsonProperty("ContactPhone")
    private String contactPhone;

    @NotNull
    @JsonProperty("ContactPrimaryIdentificationExpiryDate")
    private String contactPrimaryIdentificationExpiryDate;

    @JsonProperty("ContactPrimaryIdentificationIssuingAgency")
    private String contactPrimaryIdentificationIssuingAgency;

    @NotNull
    @JsonProperty("ContactPrimaryIdentificationNumber")
    private String contactPrimaryIdentificationNumber;

    @NotNull
    @JsonProperty("ContactPrimaryIdentificationType")
    private String contactPrimaryIdentificationType;

    @NotNull
    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("ExpectedMonthlyVolume")
    private String expectedMonthlyVolume;

    @JsonProperty("ExpectedMonthlyPayments")
    private String expectedMonthlyPayments;

    @NotNull
    @JsonProperty("FirstName")
    private String firstName;

    @NotNull
    @JsonProperty("Gender")
    private String gender;

    @NotNull
    @JsonProperty("Image")
    private String image;

    @NotNull
    @JsonProperty("ImageType")
    private String imageType;

    @JsonProperty("JobTitle")
    private String jobTitle;

    @JsonProperty("LastName")
    private String lastName;

    @NotNull
    @JsonProperty("MiddleName")
    private String middleName;

    @JsonProperty("PrimaryEmailAddress")
    private String primaryEmailAddress;

    @JsonProperty("TaxIdentificationNumber")
    private String taxIdentificationNumber;

    @NotNull
    @JsonProperty("TermsAndConditions")
    private String termsAndConditions;

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
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

    public String getContactZip() {
        return contactZip;
    }

    public void setContactZip(String contactZip) {
        this.contactZip = contactZip;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactStateRegion() {
        return contactStateRegion;
    }

    public void setContactStateRegion(String contactStateRegion) {
        this.contactStateRegion = contactStateRegion;
    }

    public String getContactCountryCode() {
        return contactCountryCode;
    }

    public void setContactCountryCode(String contactCountryCode) {
        this.contactCountryCode = contactCountryCode;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactPrimaryIdentificationExpiryDate() {
        return contactPrimaryIdentificationExpiryDate;
    }

    public void setContactPrimaryIdentificationExpiryDate(String contactPrimaryIdentificationExpiryDate) {
        this.contactPrimaryIdentificationExpiryDate = contactPrimaryIdentificationExpiryDate;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getExpectedMonthlyVolume() {
        return expectedMonthlyVolume;
    }

    public void setExpectedMonthlyVolume(String expectedMonthlyVolume) {
        this.expectedMonthlyVolume = expectedMonthlyVolume;
    }

    public String getExpectedMonthlyPayments() {
        return expectedMonthlyPayments;
    }

    public void setExpectedMonthlyPayments(String expectedMonthlyPayments) {
        this.expectedMonthlyPayments = expectedMonthlyPayments;
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

    public String getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    public void setPrimaryEmailAddress(String primaryEmailAddress) {
        this.primaryEmailAddress = primaryEmailAddress;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PrivateClient{");
        sb.append("citizenship='").append(citizenship).append('\'');
        sb.append(", contactAddress1=").append(contactAddress1).append('\'');
        sb.append(", contactAddress2=").append(contactAddress2).append('\'');
        sb.append(", contactAddress3=").append(contactAddress3).append('\'');
        sb.append(", contactZip=").append(contactZip).append('\'');
        sb.append(", contactCity=").append(contactCity).append('\'');
        sb.append(", contactStateRegion=").append(contactStateRegion).append('\'');
        sb.append(", contactCountryCode=").append(contactCountryCode).append('\'');
        sb.append(", contactPhone=").append(contactPhone).append('\'');
        sb.append(", contactPrimaryIdentificationExpiryDate=").append(contactPrimaryIdentificationExpiryDate).append('\'');
        sb.append(", contactPrimaryIdentificationIssuingAgency=").append(contactPrimaryIdentificationIssuingAgency).append('\'');
        sb.append(", contactPrimaryIdentificationNumber=").append(contactPrimaryIdentificationNumber).append('\'');
        sb.append(", contactPrimaryIdentificationType=").append(contactPrimaryIdentificationType).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth).append('\'');
        sb.append(", expectedMonthlyVolume=").append(expectedMonthlyVolume).append('\'');
        sb.append(", expectedMonthlyPayments=").append(expectedMonthlyPayments).append('\'');
        sb.append(", firstName=").append(firstName).append('\'');
        sb.append(", gender=").append(gender).append('\'');
        sb.append(", image=").append(image).append('\'');
        sb.append(", imageType=").append(imageType).append('\'');
        sb.append(", jobTitle=").append(jobTitle).append('\'');
        sb.append(", lastName=").append(lastName).append('\'');
        sb.append(", middleName=").append(middleName).append('\'');
        sb.append(", primaryEmailAddress=").append(primaryEmailAddress).append('\'');
        sb.append(", taxIdentificationNumber=").append(taxIdentificationNumber).append('\'');
        sb.append(", termsAndConditions=").append(termsAndConditions).append('\'');
        sb.append('}');
        return sb.toString();
    }


}