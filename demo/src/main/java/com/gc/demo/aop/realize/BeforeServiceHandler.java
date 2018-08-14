package com.gc.demo.aop.realize;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class BeforeServiceHandler implements InvocationHandler {

  private Object target;

  public BeforeServiceHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("执行前织入的代码!!!");
    return method.invoke(target, args);
  }

  public static void main(String[] args) {
    Service service = (Service) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[] {Service.class}, new BeforeServiceHandler(new ServiceImpl()));
    service.doSomething();
  }

}
