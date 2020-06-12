package com.advanced.bank.bank.system.model;

// import org.springFramework.transaction.TransactionStatus;

import java.time.Instant;

import com.advanced.bank.bank.system.model.enums.TransactionStatus;

public class Transaction {
    private Long id;
    private Account sender;
    private Account receiver;
    private String description;
    private Instant dateCreated;
    private Instant dateCompeted;
    private Instant dateUpdated;
    private TransactionStatus transactionStatus = TransactionStatus.NEW;
    private Long fee;
    private Long amount;

    public Long getId() {
        return id;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desctription) {
        this.description = desctription;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Instant getDateCompeted() {
        return dateCompeted;
    }

    public void setDateCompeted(Instant dateCompeted) {
        this.dateCompeted = dateCompeted;
    }

    public Instant getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Instant dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
