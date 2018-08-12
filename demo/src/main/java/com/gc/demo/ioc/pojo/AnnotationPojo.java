package com.gc.demo.ioc.pojo;

import org.springframework.stereotype.Component;

@Component
public class AnnotationPojo {

    public void print() {
	System.out.println("Hello AnnotationPojo");
    }

}
