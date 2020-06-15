package com.advanced.bank.bank.system.service;

import com.advanced.bank.bank.system.model.Address;

import java.util.List;

public interface AddressService {

    void createAddress (Address address);

    void updateAddress (Address address);

    Address getAddressById (Long AddressId);

    List<Address> getAllAddresses();

    void deleteUserById(Long id);
}
