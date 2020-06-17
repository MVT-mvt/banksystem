package com.advanced.bank.bank.system.model.contract;

import com.advanced.bank.bank.system.model.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table (name = " contracts")
public class Contract {

    @Id
    private Long id;
    @Column
    private Account account;

    private Instant expiresOn;
    private Instant dateCreated;
    private ContractDetails contractDetails;

    public Long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Instant getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(Instant expiresOn) {
        this.expiresOn = expiresOn;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }


}
