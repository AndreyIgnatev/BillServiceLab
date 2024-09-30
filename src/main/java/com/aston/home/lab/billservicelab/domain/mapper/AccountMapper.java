package com.aston.home.lab.billservicelab.domain.mapper;

import com.aston.home.lab.billservicelab.domain.dto.AccountDTO;
import com.aston.home.lab.billservicelab.domain.entity.Account;
import jakarta.persistence.Column;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

import java.util.UUID;

@Mapper(componentModel = "spring",
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper {

    @Mapping(target = "id", source = "account.id")
    @Mapping(target = "userId", expression = "java(account.getUserId().toString())") // Исправляем доступ к userId
    @Mapping(target = "cashAccount", source = "account.cashAccount")
    @Mapping(target = "status", source = "account.status")
    AccountDTO accountToAccountDto(Account account);

    @Mapping(target = "id", source = "accountDTO.id")
    @Mapping(target = "userId", expression = "java(java.util.UUID.fromString(accountDTO.getUserId()))") // Исправляем доступ к userId
    @Mapping(target = "cashAccount", source = "accountDTO.cashAccount")
    @Mapping(target = "status", source = "accountDTO.status")
    Account accountDTOToAccount(AccountDTO accountDTO);
}
