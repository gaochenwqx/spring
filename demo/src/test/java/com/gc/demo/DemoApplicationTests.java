package com.gc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gc.demo.ioc.annotation.Man;
import com.gc.demo.ioc.config.Printer;
import com.gc.demo.ioc.di.PrintService;
import com.gc.demo.ioc.pojo.AnnotationPojo;
import com.gc.demo.ioc.pojo.ConfigPojo;
import com.gc.demo.ioc.pojo.XmlPojo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    AnnotationPojo annotationPojo;

    @Autowired
    ConfigPojo configPojo;

    @Autowired
    XmlPojo xmlPojo;

    @Test
    public void pogoTest() {
	annotationPojo.print();
	configPojo.print();
	xmlPojo.print();
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
    Man man;

    @Test
    public void annotationTest() {
	man.showGun();
    }

}
