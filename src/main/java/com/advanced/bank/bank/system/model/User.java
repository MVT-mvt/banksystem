package com.advanced.bank.bank.system.model;

import com.advanced.bank.bank.system.model.enums.UserType;

import java.util.List;
import java.util.Set;

public class User {

    private Long id;

    private UserType userType;

    private Set<Object> accounts;

    String firstName;

    String lastname;

    String egn;

    String mobileNumber;

    List<Object> addresses;

    String email;

    private String password;



}
