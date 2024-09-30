package com.aston.home.lab.billservicelab.controller;

import com.aston.home.lab.billservicelab.domain.dto.AccountDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@RequestMapping("/app/v1/account")
public interface AccountController {

    @GetMapping("/user/{userId}")
    public List<AccountDTO> getAllUsersAccounts(@PathVariable String userId);

    @PostMapping
    public AccountDTO createUserAccounts(@RequestBody AccountDTO accountDTO);

    @DeleteMapping("/user/{id}")
    public AccountDTO deleteUserAccountsId(@PathVariable Long id);

}