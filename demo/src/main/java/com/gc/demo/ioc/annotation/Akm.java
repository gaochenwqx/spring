package com.gc.demo.ioc.annotation;

import org.springframework.stereotype.Component;

@Component
public class Akm implements Gun {

    @Override
    public void show() {
	System.out.println("AKM");
    }

}
