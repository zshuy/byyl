package com.spring5AspectJ.aspectJ_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect //表示当前类为切面
public class MyAspect {
    @Before("execution(* *..ISomeService.doFirst(..))")
    public void myBefore() {
        System.out.println("执行前置通知方法");
    }

    @Before("execution(* *..ISomeService.doFirst(..))")
    public void myBefore(JoinPoint jp) {
        //前置通知可以带一个JoinPoint类型的参数，值为具体的aspect表达式
        System.out.println("执行前置通知方法 jp-" + jp);
    }

    @AfterReturning("execution(* *..ISomeService.doSecond(..))")
    public void myAfterReturning() {
        System.out.println("执行后置通知方法");
    }

    @AfterReturning(value = "execution(* *..ISomeService.doSecond(..))", returning = "result")
    public void myAfterReturning(Object result) {
        System.out.println("执行后置通知方法 result-" + result);
    }

    @Around("execution(* *..ISomeService.doSecond(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知：目标前");
        Object result = pjp.proceed();
        System.out.println("环绕通知：目标后");
        if (result != null) {
            result = ((String)result).toUpperCase();
        }
        return result;
    }

    @AfterThrowing("execution(* *..ISomeService.doThird(..))")
    public void myAfterThrowing() {
        System.out.println("执行异常通知方法");
    }

    @AfterThrowing(value = "execution(* *..ISomeService.doThird(..))", throwing = "ex")
    public void myAfterThrowing(UsernameException ex) {
        System.out.println("执行异常通知方法 ex-" + ex);
    }

    @AfterThrowing(value = "execution(* *..ISomeService.doThird(..))", throwing = "ex")
    public void myAfterThrowing(PasswordException ex) {
        System.out.println("执行异常通知方法 ex-" + ex);
    }

//    @After("execution(* *..ISomeService.doThird(..))")
    @After("doThirdPointCut()")
    public void myAfter() {
        System.out.println("执行最终通知方法");
    }

    //定义了一个切入点,叫做doThirdPointCut()
    @Pointcut("execution(* *..ISomeService.doThird(..))")
    public void doThirdPointCut() { }
}
