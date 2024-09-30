package com.aston.home.lab.billservicelab.service;

import com.aston.home.lab.billservicelab.domain.dto.AccountDTO;

import java.util.List;
import java.util.UUID;

public interface AccountService {

    public List<AccountDTO> getAllUsersAccounts(String userId);

    public AccountDTO createUserAccounts(AccountDTO accountDTO);

    public AccountDTO deleteUserAccountsId(Long id);

}
