package com.example.demospringboot32;

public enum UserRole {
    // You shouldn't to change order of enum entries because these used in Hibernate's @Enumerated
    ROLE_ADMIN, // 0
    ROLE_USER, // 1
}
