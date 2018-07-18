package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountStatusResponse {

    @JsonProperty(value = "AccountStatus")
    private String accountStatus;

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AccountStatusResponse{");
        sb.append("accountStatus='").append(accountStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
