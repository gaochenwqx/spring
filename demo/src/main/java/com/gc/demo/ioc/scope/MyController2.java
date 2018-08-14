package com.gc.demo.ioc.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {

  @Autowired
  CountService countService;

  @RequestMapping("/index2")
  public String simple(ModelMap map) {
    map.addAttribute("count", countService.count());
    return "simple";
  }

}
