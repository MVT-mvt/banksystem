package com.advanced.bank.bank.system.controller;


import com.advanced.bank.bank.system.model.contract.Contract;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contracts")
public class ContractController {
    @PostMapping
    public void createContract (@RequestBody Contract contract){

    }
    @PutMapping
    public void updateContract(@RequestBody Contract contract){

    }

    @GetMapping
    public List<Contract>getAllContracts(){
        return null;
    }
    @GetMapping
    public Contract getContract (@PathVariable Long ContractId){
        return null;
    }
    @DeleteMapping
    public void deleteContract(@PathVariable Long contractId){

    }
}