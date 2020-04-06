package com.tier2.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_user")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "role_id")
    private int roleId;



    public User() {
    }

    public User( int id,  String username,  String password,  String firstName,  String lastName, int userRole) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = userRole;
    }

    public int getId() {
        return this.id;
    }

    public void setId( int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername( String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword( String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName( String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName( String lastName) {
        this.lastName = lastName;
    }

    public int getUserRole() {
        return this.roleId;
    }

    public void setUserRole( int userRole) {
        this.roleId = userRole;
    }

    public User id( int id) {
        this.id = id;
        return this;
    }

    public User username( String username) {
        this.username = username;
        return this;
    }

    public User password( String password) {
        this.password = password;
        return this;
    }

    public User firstName( String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User lastName( String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User userRole( int userRole) {
        this.roleId = userRole;
        return this;
    }

    @Override
    public boolean equals( Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
         User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(roleId, user.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, roleId);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", userRole='" + getUserRole() + "'" +
            "}";
    }

}