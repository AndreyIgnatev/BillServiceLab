package com.aston.home.lab.billservicelab.service;

import com.aston.home.lab.billservicelab.domain.dto.AccountDTO;

import java.util.List;
import java.util.UUID;

public interface AccountService {

    List<AccountDTO> getAllUsersAccounts(String userId);

    AccountDTO createUserAccounts(AccountDTO accountDTO);

    AccountDTO deleteUserAccountsId(Long id);

}
