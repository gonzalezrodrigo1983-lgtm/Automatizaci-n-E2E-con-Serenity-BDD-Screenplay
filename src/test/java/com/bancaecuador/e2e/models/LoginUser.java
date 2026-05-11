package com.bancaecuador.e2e.models;

public class LoginUser {
    private String username;
    private String password;
    private String expectedMessage;
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getExpectedMessage() { return expectedMessage; }
}
