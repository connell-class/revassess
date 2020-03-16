package com.tier2.model;

import java.util.Objects;

public class User {
    private int id, role_id;
    private String username, password, first_name, last_name;

    public User() {
    }

    public User(int id, String username, String password, String first_name, String last_name, int role_id) {
        this.id = id;
        this.role_id = role_id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return this.role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public User id(int id) {
        this.id = id;
        return this;
    }

    public User role_id(int role_id) {
        this.role_id = role_id;
        return this;
    }

    public User username(String username) {
        this.username = username;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User first_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public User last_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id && role_id == user.role_id && Objects.equals(username, user.username)
                && Objects.equals(password, user.password) && Objects.equals(first_name, user.first_name)
                && Objects.equals(last_name, user.last_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role_id, username, password, first_name, last_name);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", role_id='" + getRole_id() + "'" + ", username='" + getUsername() + "'"
                + ", password='" + getPassword() + "'" + ", first_name='" + getFirst_name() + "'" + ", last_name='"
                + getLast_name() + "'" + "}";
    }

}