package com.gc.demo.aop.demo;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

  @Override
  public void doSomething() {
    System.out.println("执行业务逻辑");
  }

  @Override
  public void work() {
    // doSomething();
    ((Service) AopContext.currentProxy()).doSomething();
  }

}
