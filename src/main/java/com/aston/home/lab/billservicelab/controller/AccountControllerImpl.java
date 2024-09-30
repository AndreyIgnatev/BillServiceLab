package com.aston.home.lab.billservicelab.controller;

import com.aston.home.lab.billservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.billservicelab.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AccountControllerImpl implements AccountController {

    private final AccountService accountService;

    @Override
    public List<AccountDTO> getAllUsersAccounts(String userId) {
        return accountService.getAllUsersAccounts(userId);
    }

    @Override
    public AccountDTO createUserAccounts(AccountDTO accountDTO) {
        System.out.println(accountDTO);
        return accountService.createUserAccounts(accountDTO);
    }

    @Override
    public AccountDTO deleteUserAccountsId(Long id) {
        return accountService.deleteUserAccountsId(id);
    }
}