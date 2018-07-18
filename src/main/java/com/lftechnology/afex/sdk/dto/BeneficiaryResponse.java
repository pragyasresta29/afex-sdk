package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficiaryResponse {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("VendorId")
    private String vendorId;

    @JsonProperty("Status")
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BeneficiaryResponse{");
        sb.append("name='").append(name).append('\'');
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", vendorId='").append(vendorId).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
