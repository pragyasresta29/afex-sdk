package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * @author Pragya Shrestha <pragyashrestha@lftechnology.com>
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BeneficiaryValidationInformation {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Code")
    private Integer code;

    @JsonProperty("InformationMessage")
    private Object informationMessage;

    @JsonProperty("InformationCode")
    private Integer informationCode;

    @JsonProperty("Status")
    private Object status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getInformationMessage() {
        return informationMessage;
    }

    public void setInformationMessage(Object informationMessage) {
        this.informationMessage = informationMessage;
    }

    public Integer getInformationCode() {
        return informationCode;
    }

    public void setInformationCode(Integer informationCode) {
        this.informationCode = informationCode;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BeneficiaryValidationInformation{");
        sb.append("name='").append(name).append('\'');
        sb.append(", code=").append(code);
        sb.append(", informationMessage=").append(informationMessage);
        sb.append(", informationCode=").append(informationCode);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
