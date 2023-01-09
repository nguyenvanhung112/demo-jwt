package com.example.demo.dto;

import com.example.demo.model.Account;
import com.example.demo.model.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

public class JwtRespone {

    private Integer id;
    private String token;
    private String type = "Bearer";
    private String name;
    private String username;
    private Account account;
    private User user;
    private String email;
    private Collection<? extends GrantedAuthority> roles;

    public JwtRespone() {
    }

    public JwtRespone(Integer id, String token, String type, String name, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.token = token;
        this.type = type;
        this.name = name;
        this.roles = roles;
    }

    public JwtRespone(String token, String username, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.name = username;
        this.roles = authorities;

    }


    public JwtRespone(String token, String name, String username, Collection<? extends GrantedAuthority> roles) {
        this.token = token;
        this.name = name;
        this.username = username;
        this.roles = roles;
    }

    public JwtRespone(String token, Account account, User user, Collection<? extends GrantedAuthority> roles) {
        this.token = token;
        this.account = account;
        this.user = user;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }

    public void setRoles(Collection<? extends GrantedAuthority> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
