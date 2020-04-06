package com.tier2.model;

import javax.persistence.Entity;

import com.tier2.model.User;

@Entity
public class UserStudySet extends User {

    private int study_set_id;
    private String name;

    @Override
    public String toString() {
        return super.toString() + " " + study_set_id + " " + name;
    }

    public UserStudySet() {
    }

    public UserStudySet(int id, String username, String password, String firstname, String lastname, int roleId,
            int StudySetId, String studyName) {
        super(id, username, password, firstname, lastname, roleId);
        this.study_set_id = StudySetId;
        this.name = studyName;
    }

}