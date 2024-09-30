package com.aston.home.lab.billservicelab.domain.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class AccountDTO {
    private Long id;
    private String userId;
    private Long cashAccount;
    private Boolean status;
}