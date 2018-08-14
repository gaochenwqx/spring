package com.gc.demo.ioc.scope;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
public class CountServiceImpl implements CountService {

  AtomicInteger count = new AtomicInteger(0);

  @Override
  public Integer count() {
    return count.incrementAndGet();
  }

}
