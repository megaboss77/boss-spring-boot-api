package com.boss.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;

@ApiModel(value = "AccountLoan", description = "Data model for Student")
@JsonPropertyOrder({"accountType", "documentNumber","effectiveDate"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountLoan {
    private String accountNumber;
    private String accountType;
    private String documentNumber;
    private String effectiveDate;
    private Double transactionAmount;

    @Override
    public String toString() {
        return "AccountLoan{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", transactionAmount=" + transactionAmount +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

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

    public AccountLoan(String accountNumber, String accountType, String documentNumber, String effectiveDate, Double transactionAmount) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.documentNumber = documentNumber;
        this.effectiveDate = effectiveDate;
        this.transactionAmount = transactionAmount;
    }
}
