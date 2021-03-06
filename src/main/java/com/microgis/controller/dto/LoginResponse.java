package com.microgis.controller.dto;

import lombok.Data;

@Data
public class LoginResponse {

    /**
     * volo domain
     */
    private String domain;

    /**
     * driver id
     */
    private String id;

    /**
     * driver name
     */
    private String name;

    /**
     * driver email
     */
    private String email;

    /**
     * driver phine number
     */
    private String phone;

}