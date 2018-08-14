package com.gc.demo.ioc.pojo;

import org.springframework.stereotype.Component;

@Component
public class AnnotationBean {

  public void print() {
    System.out.println("Hello AnnotationBean");
  }

}
