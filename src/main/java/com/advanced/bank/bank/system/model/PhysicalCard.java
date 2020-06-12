package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.CardType;

import java.time.Instant;
import java.util.HashSet;

public class PhysicalCard {
    private Long id;
    private Integer cardNumber;
    private CardType cardType = CardType.NONE;
    private Instant expirationDate;
    private Integer cvv;
    private Integer pin;
    private Account account;
    boolean isActive = false;

    public Long getId() {
        return id;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Instant getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Instant expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
