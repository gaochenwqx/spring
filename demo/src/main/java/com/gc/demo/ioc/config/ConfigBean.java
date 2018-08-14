package com.gc.demo.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gc.demo.ioc.annotation.PageInfo;

@Configuration
@ComponentScan(basePackages = {"com.gc.demo.ioc.config", "com.gc.demo.ioc.annotation"})
@ComponentScan(basePackageClasses = {PageInfo.class})
public class ConfigBean {

  @Bean("showA")
  ShowA showA() {
    return new ShowA();
  }

  @Bean
  Printer printer() {
    return new Printer(showA());
  }

}
