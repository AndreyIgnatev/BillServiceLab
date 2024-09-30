package com.aston.home.lab.billservicelab.service;

import com.aston.home.lab.billservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.billservicelab.domain.entity.Account;
import com.aston.home.lab.billservicelab.domain.mapper.AccountMapper;
import com.aston.home.lab.billservicelab.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;
    private final AccountRepository accountRepository;

    @Override
    public List<AccountDTO> getAllUsersAccounts(String userId) {

        return accountRepository.
                findAll().
                stream().
                filter(a -> a.getUserId().toString().equals(userId)).
                toList().
                stream().
                map(accountMapper::accountToAccountDto).
                toList();
    }

    @Override
    public AccountDTO createUserAccounts(AccountDTO accountDTO) {
        Account account = accountRepository.save(accountMapper.accountDTOToAccount(accountDTO));
        return accountMapper.accountToAccountDto(account);
    }

    @Override
    public AccountDTO deleteUserAccountsId(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));
        accountRepository.deleteById(id);
        return accountMapper.accountToAccountDto(account);
    }
}