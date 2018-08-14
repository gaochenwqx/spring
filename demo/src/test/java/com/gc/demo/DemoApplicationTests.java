package com.gc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gc.demo.aop.demo.Service;
import com.gc.demo.ioc.annotation.Person;
import com.gc.demo.ioc.config.Printer;
import com.gc.demo.ioc.di.PrintService;
import com.gc.demo.ioc.pojo.AnnotationBean;
import com.gc.demo.ioc.pojo.JavaConfigBean;
import com.gc.demo.ioc.pojo.XmlBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

  @Autowired
  AnnotationBean annotationBean;

  @Autowired
  JavaConfigBean javaConfigBean;

  @Autowired
  XmlBean xmlBean;

  @Test
  public void pogoTest() {
    annotationBean.print();
    javaConfigBean.print();
    xmlBean.print();
  }

  @Autowired
  @Qualifier("printAServiceImpl")
  PrintService printService;

  @Test
  public void diTest() {
    printService.print();
  }

  @Autowired
  Printer printer;

  @Test
  public void configTest() {
    printer.print();
  }

  @Autowired
  Person person;

  @Test
  public void annotationTest() {
    person.showGun();
  }

  @Autowired
  Service service;

  @Test
  public void aopTest() {
    service.work();
  }

}
