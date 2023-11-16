package com.practice.crmApp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/home")
    public ModelAndView getHome(){
        logger.info("MainController->Getting /home");
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("msg","Customer Table");
        return mv;
    }

    @GetMapping("/AddCustomer")
    public ModelAndView addCustomer(){
        ModelAndView mv = new ModelAndView("addCustomer");
        mv.addObject("msg","Customer Table");
        return mv;
    }
}
