package com.tier2.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProblem4 {

    @Id
    private String username;
    private String set_name;
    private String category_name;
    private String question;
    private String answer;


    public UserProblem4() {
    }

    public UserProblem4(String username, String set_name, String category_name, String question, String answer) {
        this.username = username;
        this.set_name = set_name;
        this.category_name = category_name;
        this.question = question;
        this.answer = answer;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSet_name() {
        return this.set_name;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    public String getCategory_name() {
        return this.category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public UserProblem4 username(String username) {
        this.username = username;
        return this;
    }

    public UserProblem4 set_name(String set_name) {
        this.set_name = set_name;
        return this;
    }

    public UserProblem4 category_name(String category_name) {
        this.category_name = category_name;
        return this;
    }

    public UserProblem4 question(String question) {
        this.question = question;
        return this;
    }

    public UserProblem4 answer(String answer) {
        this.answer = answer;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserProblem4)) {
            return false;
        }
        UserProblem4 userProblem4 = (UserProblem4) o;
        return Objects.equals(username, userProblem4.username) && Objects.equals(set_name, userProblem4.set_name) && Objects.equals(category_name, userProblem4.category_name) && Objects.equals(question, userProblem4.question) && Objects.equals(answer, userProblem4.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, set_name, category_name, question, answer);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", set_name='" + getSet_name() + "'" +
            ", category_name='" + getCategory_name() + "'" +
            ", question='" + getQuestion() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }

}