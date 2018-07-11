package com.lftechnology.afex.sdk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Trade {

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @NotNull
    @JsonProperty("Amount")
    private String amount;

    @JsonProperty("IsAmountSettlement")
    private String isAmountSettlement;

    @JsonProperty("Note")
    private String note;

    @JsonProperty("POPCode")
    private String popCode;

    @JsonProperty("PurposeOfPayment")
    private String purposeOfPayment;

    @JsonProperty("QuoteID")
    private String quoteID;

    @NotNull
    @JsonProperty("SettlementCcy")
    private String settlementCcy;

    @NotNull
    @JsonProperty("TradeCcy")
    private String tradeCcy;

    @NotNull
    @JsonProperty("ValueDate")
    private String valueDate;

    @JsonProperty("VendorId")
    private String vendorId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trade{");
        sb.append("accountNumber='").append(accountNumber).append('\'');
        sb.append(", amount='").append(amount).append('\'');
        sb.append(", isAmountSettlement='").append(isAmountSettlement).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", popCode='").append(popCode).append('\'');
        sb.append(", purposeOfPayment='").append(purposeOfPayment).append('\'');
        sb.append(", quoteID='").append(quoteID).append('\'');
        sb.append(", settlementCcy='").append(settlementCcy).append('\'');
        sb.append(", tradeCcy='").append(tradeCcy).append('\'');
        sb.append(", valueDate='").append(valueDate).append('\'');
        sb.append(", vendorId='").append(vendorId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
