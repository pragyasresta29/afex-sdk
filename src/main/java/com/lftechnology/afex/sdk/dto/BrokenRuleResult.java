package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrokenRuleResult {

    @JsonProperty("IsValid")
    private boolean isValid;
    @JsonProperty("BrokenRules")
    private Object brokenRules;
    @JsonProperty("ErrorMessage")
    private String errorMessage;

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Object getBrokenRules() {
        return brokenRules;
    }

    public void setBrokenRules(Object brokenRules) {
        this.brokenRules = brokenRules;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BrokenRuleResult{");
        sb.append("isValid=").append(isValid);
        sb.append(", brokenRules=").append(brokenRules);
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
