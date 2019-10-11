package com.spring5AspectJ.aspectJ_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect //表示当前类为切面
public class MyAspect {
    public void myBefore() {
        System.out.println("执行前置通知方法");
    }

    public void myBefore(JoinPoint jp) {
        //前置通知可以带一个JoinPoint类型的参数，值为具体的aspect表达式
        System.out.println("执行前置通知方法 jp-" + jp);
    }

    public void myAfterReturning() {
        System.out.println("执行后置通知方法");
    }

    public void myAfterReturning(Object result) {
        System.out.println("执行后置通知方法 result-" + result);
    }

    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知：目标前");
        Object result = pjp.proceed();
        System.out.println("环绕通知：目标后");
        if (result != null) {
            result = ((String)result).toUpperCase();
        }
        return result;
    }

    public void myAfterThrowing() {
        System.out.println("执行异常通知方法");
    }

    public void myAfterThrowing(UsernameException ex) {
        System.out.println("执行异常通知方法 ex-" + ex);
    }

    public void myAfterThrowing(PasswordException ex) {
        System.out.println("执行异常通知方法 ex-" + ex);
    }

    public void myAfter() {
        System.out.println("执行最终通知方法");
    }

    public void doThirdPointCut() { }
}
