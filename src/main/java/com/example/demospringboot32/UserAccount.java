package com.example.demospringboot32;

import java.time.LocalDateTime;

public record UserAccount(

    Long id,
    CreationType creationType,
    String username,
    String password, // hash
    String avatar, // avatar url
    String avatarBig, // avatar url

    String shortInfo, // job title, short bio, ...

    boolean expired,
    boolean locked,
    boolean enabled,
    boolean confirmed,
    UserRole role, // synonym to "authority"
    String email,
    LocalDateTime lastLoginDateTime
) {

}
