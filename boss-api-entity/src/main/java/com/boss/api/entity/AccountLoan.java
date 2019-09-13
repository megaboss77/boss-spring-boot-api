package com.boss.api.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "ACCOUNT_LOAN")
public class AccountLoan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ACCOUNT_NUMBER", length = 13, nullable = false)
    private String accountNumber;
    @Column(name = "ACCOUNT_TYPE", length = 13, nullable = false)
    private String accountType;
    @Column(name = "DOCUMENT_NUMBER", length = 13, nullable = false)
    private String documentNumber;
    @Column(name = "EFFECTIVE_DATE", length = 13, nullable = false)
    private String effectiveDate;
    @Column(name = "TRANSACTION_AMOUNT", length = 13, nullable = false)
    private Double transactionAmount;

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
}
