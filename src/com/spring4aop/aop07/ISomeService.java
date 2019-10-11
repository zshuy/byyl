package com.spring4aop.aop07;

public interface ISomeService {
    public boolean login(String username, String password) throws UsernameException, PasswordException;
}
