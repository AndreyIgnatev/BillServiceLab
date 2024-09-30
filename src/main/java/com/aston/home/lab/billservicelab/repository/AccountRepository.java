package com.aston.home.lab.billservicelab.repository;

import com.aston.home.lab.billservicelab.domain.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}