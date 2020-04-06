package com.tier2.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStudySet {
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
    private int study_set_id;
    private String name;


    public UserStudySet() {
    }

    public UserStudySet(int id, String username, String password, String firstName, String lastName, int roleId, int study_set_id, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roleId = roleId;
        this.study_set_id = study_set_id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getStudy_set_id() {
        return this.study_set_id;
    }

    public void setStudy_set_id(int study_set_id) {
        this.study_set_id = study_set_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserStudySet id(int id) {
        this.id = id;
        return this;
    }

    public UserStudySet username(String username) {
        this.username = username;
        return this;
    }

    public UserStudySet password(String password) {
        this.password = password;
        return this;
    }

    public UserStudySet firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserStudySet lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserStudySet roleId(int roleId) {
        this.roleId = roleId;
        return this;
    }

    public UserStudySet study_set_id(int study_set_id) {
        this.study_set_id = study_set_id;
        return this;
    }

    public UserStudySet name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserStudySet)) {
            return false;
        }
        UserStudySet userStudySet = (UserStudySet) o;
        return id == userStudySet.id && Objects.equals(username, userStudySet.username) && Objects.equals(password, userStudySet.password) && Objects.equals(firstName, userStudySet.firstName) && Objects.equals(lastName, userStudySet.lastName) && roleId == userStudySet.roleId && study_set_id == userStudySet.study_set_id && Objects.equals(name, userStudySet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, roleId, study_set_id, name);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", roleId='" + getRoleId() + "'" +
            ", study_set_id='" + getStudy_set_id() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
   

    
}