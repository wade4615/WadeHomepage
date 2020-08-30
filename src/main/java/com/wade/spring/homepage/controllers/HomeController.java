package com.wade.spring.homepage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wade.spring.homepage.nasa.service.NasaService;

@Controller
public class HomeController {
	@Autowired
    private NasaService service;
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
	@RequestMapping(value = "/apod")
    public Object getApod(){
        return service.getApod();
    }

	@RequestMapping(value = "/neo")
    public Object getNeos(){
        return service.getNeos();
    }

	@RequestMapping(value = "/roverphotos")
    public Object getMarsPics(){
        return service.getMarsPics();
    }
}
