package com.gc.demo.ioc.config;

public class Printer {

    ShowA showA;

    public Printer(ShowA showA) {
	this.showA = showA;
    }

    public void print() {
	System.out.println(showA.show());
    }

}
