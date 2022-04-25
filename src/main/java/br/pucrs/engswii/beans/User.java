package br.pucrs.engswii.beans;

public class User {
    String name;
    String password;
    Boolean isLogged;

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
