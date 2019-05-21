package com.backend.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Role implements GrantedAuthority {


    public Role(String name) {
        this.name = name;
    }
    public Role() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;


    @Override
    public String getAuthority() {
        return  this.name;
    }
}
