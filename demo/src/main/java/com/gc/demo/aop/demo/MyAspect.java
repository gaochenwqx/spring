package com.gc.demo.aop.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

  @Pointcut("execution(** com.gc.demo.*..doSomething(..)) && within(com.gc.demo.aop.demo.*) && bean(serviceImpl)")
  public void pointcut() {}

  @Before("pointcut()")
  public void beford() {
    System.out.println("执行前");
  }

  @AfterReturning("pointcut()")
  public void afterReturning() {
    System.out.println("执行后");
  }

  @Around("pointcut()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("环绕 前");
    Object ret = pjp.proceed();
    System.out.println("环绕 后");
    return ret;
  }

}
