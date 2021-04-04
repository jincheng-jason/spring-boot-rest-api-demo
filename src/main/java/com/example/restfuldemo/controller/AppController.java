package com.example.restfuldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * AppController
 * @author Jason Li
 */
@Controller
public class AppController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ModelAndView app() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
