package com.ivoronline.controller_returns_jsp.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @RequestMapping("/hello")
  public String sayHello(Model model) {
    model.addAttribute("message", "Message from Controller");
    return "index";
  }

}
