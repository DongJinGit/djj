package com.example.ssm1.doman;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class User {
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-mm-dd-")
    private LocalDate signInDate;

    public User() {
    }

    public User(int id, String name, LocalDate signInDate) {
        this.id = id;
        this.name = name;
        this.signInDate = signInDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getSignInDate() {
        return signInDate;
    }

    public void setSignInDate(LocalDate signInDate) {
        this.signInDate = signInDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", signInDate=" + signInDate +
                '}';
    }
}
