package com.spring4aop.aop07;

/**
 * 异常分两种：
 * 1）运行时异常，不处理也可通过编译，
 *    继承自RuntimeException，则该异常是运行时异常
 * 2）编译时异常，又称受查异常，Checked Exception，不处理无法通过编译，
 *    继承自Exception，则该异常是受查异常
 */
public class UserException extends Exception{
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}
