package com.aston.home.lab.billservicelab.repository;

import com.aston.home.lab.billservicelab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}