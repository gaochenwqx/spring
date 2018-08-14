package com.gc.demo.ioc.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  public JavaConfigBean javaConfigBean() {
    return new JavaConfigBean();
  }

}
