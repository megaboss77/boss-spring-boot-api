package com.boss.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "AccountLoan", description = "Data model for Student")
@JsonPropertyOrder({"accountType", "documentNumber","effectiveDate"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountLoan {
    private String accountType;
    private String documentNumber;
    private String effectiveDate;
    private Double transactionAmount;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty(value = "documentNumber", required = true)
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Override
    public String toString() {
        return "AccountLoan{" +
                "accountType='" + accountType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", transactionAmount=" + transactionAmount +
                '}';
    }

    public AccountLoan(String accountType, String documentNumber, String effectiveDate, Double transactionAmount) {
        this.accountType = accountType;
        this.documentNumber = documentNumber;
        this.effectiveDate = effectiveDate;
        this.transactionAmount = transactionAmount;
    }
}
