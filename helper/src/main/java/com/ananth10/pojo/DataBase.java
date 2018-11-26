package com.ananth10.pojo;

import org.springframework.context.annotation.Configuration;

//pojo class to retrieve values of name and password
public class DataBase {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
