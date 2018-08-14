package com.gc.demo.aop.realize;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class AroundServiceHandler {

  public static Class enhanceClass() throws Exception {
    ClassPool classPool = ClassPool.getDefault();

    // 获取目标类
    CtClass targetClass = classPool.get("com.gc.demo.aop.realize.ServiceImpl");


    // 获取织入的连接点
    CtMethod doSomething = targetClass.getDeclaredMethod("doSomething");

    // 织入增强代码，这里会重新加载字节码
    doSomething.insertBefore("System.out.print(\"执行前织入的代码!!!\");");
    doSomething.insertAfter("System.out.print(\"!!!执行后织入的代码\");");

    return targetClass.toClass();
  }

  public static void main(String[] args) throws Exception {
    Class clazz = enhanceClass();

    Service service = (Service) clazz.newInstance();
    service.doSomething();
  }


}
