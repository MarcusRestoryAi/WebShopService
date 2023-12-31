package com.Molndal.WebShopService.Models;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="role_id")
    private Integer roleId;

    private String authority;

    @Override
    public String getAuthority() {
        return null;
    }
}
