package com.gc.demo.ioc.annotation;

import org.springframework.stereotype.Component;

@Component("ump9")
public class Ump9 implements Gun {

    @Override
    public void show() {
	System.out.println("UMP9");
    }

}
