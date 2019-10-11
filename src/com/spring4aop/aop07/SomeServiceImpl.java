package com.spring4aop.aop07;

public class SomeServiceImpl implements ISomeService {
    @Override
    public boolean login(String username, String password) throws UsernameException, PasswordException {
        if (!username.equals("xjm")) {
            throw new UsernameException("用户名错误");
        }

        if (!password.equals("XJM")) {
            throw new PasswordException("密码错误");
        }

//        int a = 3/0;

        return true;
    }
}
