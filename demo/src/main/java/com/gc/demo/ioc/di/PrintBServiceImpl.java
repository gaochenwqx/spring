package com.gc.demo.ioc.di;

import org.springframework.stereotype.Component;

@Component
public class PrintBServiceImpl implements PrintService {

    @Override
    public void print() {
	System.out.println("Hello B");
    }

}
