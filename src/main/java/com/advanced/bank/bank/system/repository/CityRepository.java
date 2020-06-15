package com.advanced.bank.bank.system.repository;

import com.advanced.bank.bank.system.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CityRepository extends CrudRepository<City, Long> {

}
