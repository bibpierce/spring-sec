package com.example.accountmanagement.enums;

public enum RoleEnums {
    ADMIN(1),
    USER(0);

    RoleEnums(int code) {
        this.code = code;
    }
    private int code;
}
