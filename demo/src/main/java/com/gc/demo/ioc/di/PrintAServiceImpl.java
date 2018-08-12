package com.gc.demo.ioc.di;

import org.springframework.stereotype.Component;

@Component
public class PrintAServiceImpl implements PrintService {

    @Override
    public void print() {
	System.out.println("Hello A");
    }

}
