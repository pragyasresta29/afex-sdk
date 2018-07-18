package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationIbanResponse {

    @JsonProperty("IsIban")
    private boolean isIban;

    @JsonProperty("BIC")
    private String bic;

    @JsonProperty("Message")
    private String message;

    public boolean isIban() {
        return isIban;
    }

    public void setIban(boolean iban) {
        isIban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ValidationIbanResponse{");
        sb.append("isIban=").append(isIban);
        sb.append(", bic='").append(bic).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
