package com.hftang.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {

    @RequestMapping("hello")
    public ModelAndView helloWord() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "hello springmvc--->");
        modelAndView.setViewName("/jsp/hello.jsp");
        return modelAndView;
    }

}
