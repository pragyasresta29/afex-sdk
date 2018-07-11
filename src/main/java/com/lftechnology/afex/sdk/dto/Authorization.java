package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Authorization {

    @JsonProperty("Grant_Type")
    private String grantType;

    @JsonProperty("Username")
    private String userName;

    @JsonProperty("Password")
    private String password;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Authorization{");
        sb.append("grantType='").append(grantType).append('\'');
        sb.append(", userName=").append(userName).append('\'');
        sb.append(", password=").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
