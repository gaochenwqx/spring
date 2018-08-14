package com.gc.demo.ioc.scope;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CountServiceImpl implements CountService {

  AtomicInteger count = new AtomicInteger(0);

  @Override
  public Integer count() {
    return count.incrementAndGet();
  }

}
