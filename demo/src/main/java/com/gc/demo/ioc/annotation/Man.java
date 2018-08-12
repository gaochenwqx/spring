package com.gc.demo.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Man {

    @Autowired
    Gun ump9;

    Gun akm;

    Gun sks;

    @Autowired
    private Man(Gun akm) {
	this.akm = akm;
    }

    @Autowired
    private void pickUpSks(Gun sks) {
	this.sks = sks;
    }

    public void showGun() {
	ump9.show();
	akm.show();
	sks.show();
    }

}
