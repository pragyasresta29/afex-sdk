package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Beneficiary {

    @JsonProperty("BankAccountNumber")
    private String bankAccountNumber;

    @JsonProperty("BankAddress1")
    private String bankAddress1;

    @JsonProperty("BankAddress2")
    private String bankAddress2;

    @JsonProperty("BankAddress3")
    private String bankAddress3;

    @JsonProperty("BankCountryCode")
    private String bankCountryCode;

    @JsonProperty("BankName")
    private String bankName;

    @JsonProperty("BankRoutingCode")
    private String bankRoutingCode;

    @JsonProperty("BankSWIFTBIC")
    private String bankSWIFTBIC;

    @JsonProperty("BeneficiaryAddressLine1")
    private String beneficiaryAddressLine1;

    @JsonProperty("BeneficiaryAddressLine2")
    private String beneficiaryAddressLine2;

    @JsonProperty("BeneficiaryCity")
    private String beneficiaryCity;

    @JsonProperty("BeneficiaryCountryCode")
    private String beneficiaryCountryCode;

    @JsonProperty("BeneficiaryName")
    private String beneficiaryName;

    @JsonProperty("BeneficiaryPostalCode")
    private String beneficiaryPostalCode;

    @JsonProperty("BeneficiaryRegion")
    private String beneficiaryRegion;

    @JsonProperty("Corporate")
    private String corporate;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("HighLowValue")
    private String highLowValue;

    @JsonProperty("IntermediaryBankAccountNumber")
    private String intermediaryBankAccountNumber;

    @JsonProperty("IntermediaryBankAddress1")
    private String intermediaryBankAddress1;

    @JsonProperty("IntermediaryBankAddress2")
    private String intermediaryBankAddress2;

    @JsonProperty("IntermediaryBankAddress3")
    private String intermediaryBankAddress3;

    @JsonProperty("IntermediaryBankCountryCode")
    private String intermediaryBankCountryCode;

    @JsonProperty("IntermediaryBankName")
    private String intermediaryBankName;

    @JsonProperty("IntermediaryBankRoutingCode")
    private String intermediaryBankRoutingCode;

    @JsonProperty("IntermediaryBankSWIFTBIC")
    private String intermediaryBankSWIFTBIC;

    @JsonProperty("NotificationEmail")
    private String notificationEmail;

    @JsonProperty("RemittanceLine1")
    private String remittanceLine1;

    @JsonProperty("RemittanceLine2")
    private String remittanceLine2;

    @JsonProperty("RemittanceLine3")
    private String remittanceLine3;

    @JsonProperty("RemittanceLine4")
    private String remittanceLine4;

    @JsonProperty("VendorId")
    private String vendorId;

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAddress1() {
        return bankAddress1;
    }

    public void setBankAddress1(String bankAddress1) {
        this.bankAddress1 = bankAddress1;
    }

    public String getBankAddress2() {
        return bankAddress2;
    }

    public void setBankAddress2(String bankAddress2) {
        this.bankAddress2 = bankAddress2;
    }

    public String getBankAddress3() {
        return bankAddress3;
    }

    public void setBankAddress3(String bankAddress3) {
        this.bankAddress3 = bankAddress3;
    }

    public String getBankCountryCode() {
        return bankCountryCode;
    }

    public void setBankCountryCode(String bankCountryCode) {
        this.bankCountryCode = bankCountryCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingCode() {
        return bankRoutingCode;
    }

    public void setBankRoutingCode(String bankRoutingCode) {
        this.bankRoutingCode = bankRoutingCode;
    }

    public String getBankSWIFTBIC() {
        return bankSWIFTBIC;
    }

    public void setBankSWIFTBIC(String bankSWIFTBIC) {
        this.bankSWIFTBIC = bankSWIFTBIC;
    }

    public String getBeneficiaryAddressLine1() {
        return beneficiaryAddressLine1;
    }

    public void setBeneficiaryAddressLine1(String beneficiaryAddressLine1) {
        this.beneficiaryAddressLine1 = beneficiaryAddressLine1;
    }

    public String getBeneficiaryAddressLine2() {
        return beneficiaryAddressLine2;
    }

    public void setBeneficiaryAddressLine2(String beneficiaryAddressLine2) {
        this.beneficiaryAddressLine2 = beneficiaryAddressLine2;
    }

    public String getBeneficiaryCity() {
        return beneficiaryCity;
    }

    public void setBeneficiaryCity(String beneficiaryCity) {
        this.beneficiaryCity = beneficiaryCity;
    }

    public String getBeneficiaryCountryCode() {
        return beneficiaryCountryCode;
    }

    public void setBeneficiaryCountryCode(String beneficiaryCountryCode) {
        this.beneficiaryCountryCode = beneficiaryCountryCode;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public String getBeneficiaryPostalCode() {
        return beneficiaryPostalCode;
    }

    public void setBeneficiaryPostalCode(String beneficiaryPostalCode) {
        this.beneficiaryPostalCode = beneficiaryPostalCode;
    }

    public String getBeneficiaryRegion() {
        return beneficiaryRegion;
    }

    public void setBeneficiaryRegion(String beneficiaryRegion) {
        this.beneficiaryRegion = beneficiaryRegion;
    }

    public String getCorporate() {
        return corporate;
    }

    public void setCorporate(String corporate) {
        this.corporate = corporate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getHighLowValue() {
        return highLowValue;
    }

    public void setHighLowValue(String highLowValue) {
        this.highLowValue = highLowValue;
    }

    public String getIntermediaryBankAccountNumber() {
        return intermediaryBankAccountNumber;
    }

    public void setIntermediaryBankAccountNumber(String intermediaryBankAccountNumber) {
        this.intermediaryBankAccountNumber = intermediaryBankAccountNumber;
    }

    public String getIntermediaryBankAddress1() {
        return intermediaryBankAddress1;
    }

    public void setIntermediaryBankAddress1(String intermediaryBankAddress1) {
        this.intermediaryBankAddress1 = intermediaryBankAddress1;
    }

    public String getIntermediaryBankAddress2() {
        return intermediaryBankAddress2;
    }

    public void setIntermediaryBankAddress2(String intermediaryBankAddress2) {
        this.intermediaryBankAddress2 = intermediaryBankAddress2;
    }

    public String getIntermediaryBankAddress3() {
        return intermediaryBankAddress3;
    }

    public void setIntermediaryBankAddress3(String intermediaryBankAddress3) {
        this.intermediaryBankAddress3 = intermediaryBankAddress3;
    }

    public String getIntermediaryBankCountryCode() {
        return intermediaryBankCountryCode;
    }

    public void setIntermediaryBankCountryCode(String intermediaryBankCountryCode) {
        this.intermediaryBankCountryCode = intermediaryBankCountryCode;
    }

    public String getIntermediaryBankName() {
        return intermediaryBankName;
    }

    public void setIntermediaryBankName(String intermediaryBankName) {
        this.intermediaryBankName = intermediaryBankName;
    }

    public String getIntermediaryBankRoutingCode() {
        return intermediaryBankRoutingCode;
    }

    public void setIntermediaryBankRoutingCode(String intermediaryBankRoutingCode) {
        this.intermediaryBankRoutingCode = intermediaryBankRoutingCode;
    }

    public String getIntermediaryBankSWIFTBIC() {
        return intermediaryBankSWIFTBIC;
    }

    public void setIntermediaryBankSWIFTBIC(String intermediaryBankSWIFTBIC) {
        this.intermediaryBankSWIFTBIC = intermediaryBankSWIFTBIC;
    }

    public String getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public String getRemittanceLine1() {
        return remittanceLine1;
    }

    public void setRemittanceLine1(String remittanceLine1) {
        this.remittanceLine1 = remittanceLine1;
    }

    public String getRemittanceLine2() {
        return remittanceLine2;
    }

    public void setRemittanceLine2(String remittanceLine2) {
        this.remittanceLine2 = remittanceLine2;
    }

    public String getRemittanceLine3() {
        return remittanceLine3;
    }

    public void setRemittanceLine3(String remittanceLine3) {
        this.remittanceLine3 = remittanceLine3;
    }

    public String getRemittanceLine4() {
        return remittanceLine4;
    }

    public void setRemittanceLine4(String remittanceLine4) {
        this.remittanceLine4 = remittanceLine4;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Beneficiary{");
        sb.append("bankAccountNumber='").append(bankAccountNumber).append('\'');
        sb.append("bankAddress1='").append(bankAddress1).append('\'');
        sb.append("bankAddress2='").append(bankAddress2).append('\'');
        sb.append("bankAddress3='").append(bankAddress3).append('\'');
        sb.append("bankCountryCode='").append(bankCountryCode).append('\'');
        sb.append("bankName='").append(bankName).append('\'');
        sb.append("bankRoutingCode='").append(bankRoutingCode).append('\'');
        sb.append("bankSWIFTBIC='").append(bankSWIFTBIC).append('\'');
        sb.append("beneficiaryAddressLine1='").append(beneficiaryAddressLine1).append('\'');
        sb.append("beneficiaryAddressLine2='").append(beneficiaryAddressLine2).append('\'');
        sb.append("beneficiaryCity='").append(beneficiaryCity).append('\'');
        sb.append("beneficiaryCountryCode='").append(beneficiaryCountryCode).append('\'');
        sb.append("beneficiaryName='").append(beneficiaryName).append('\'');
        sb.append("beneficiaryPostalCode='").append(beneficiaryPostalCode).append('\'');
        sb.append("beneficiaryRegion='").append(beneficiaryRegion).append('\'');
        sb.append("corporate='").append(corporate).append('\'');
        sb.append(", currency=").append(currency).append('\'');
        sb.append(", highLowValue=").append(highLowValue).append('\'');
        sb.append(", intermediaryBankAccountNumber=").append(intermediaryBankAccountNumber).append('\'');
        sb.append(", intermediaryBankAddress1=").append(intermediaryBankAddress1).append('\'');
        sb.append(", intermediaryBankAddress2=").append(intermediaryBankAddress2).append('\'');
        sb.append(", intermediaryBankAddress3=").append(intermediaryBankAddress3).append('\'');
        sb.append(", intermediaryBankCountryCode=").append(intermediaryBankCountryCode).append('\'');
        sb.append(", intermediaryBankName=").append(intermediaryBankName).append('\'');
        sb.append(", intermediaryBankRoutingCode=").append(intermediaryBankRoutingCode).append('\'');
        sb.append(", intermediaryBankSWIFTBIC=").append(intermediaryBankSWIFTBIC).append('\'');
        sb.append(", notificationEmail=").append(notificationEmail).append('\'');
        sb.append(", remittanceLine1=").append(remittanceLine1).append('\'');
        sb.append(", remittanceLine2=").append(remittanceLine2).append('\'');
        sb.append(", remittanceLine3=").append(remittanceLine3).append('\'');
        sb.append(", remittanceLine4=").append(remittanceLine4).append('\'');
        sb.append(", vendorId=").append(vendorId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
