package com.gc.demo.aop.realize;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class AfterServiceHandler implements MethodInterceptor {

  @Override
  public Object intercept(Object obj, Method arg1, Object[] args, MethodProxy proxy) throws Throwable {
    Object ret = proxy.invokeSuper(obj, args);
    System.out.println("执行后织入的代码!!!");
    return ret;
  }

  public static void main(String[] args) {
    Enhancer enhancer = new Enhancer();
    enhancer.setSuperclass(ServiceImpl.class);
    enhancer.setCallback(new AfterServiceHandler());

    ServiceImpl service = (ServiceImpl) enhancer.create();
    service.doSomething();
  }

}
