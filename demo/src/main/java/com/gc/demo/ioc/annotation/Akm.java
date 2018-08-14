package com.gc.demo.ioc.annotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Akm implements Gun {

  @Override
  public void show() {
    System.out.println("AKM");
  }

}
