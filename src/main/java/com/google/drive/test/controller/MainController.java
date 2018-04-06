package com.google.drive.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

	private static final Logger log = LoggerFactory.getLogger(MainController.class);
	
	
	@RequestMapping(path = { "" }, method = RequestMethod.GET)
	public ModelAndView inicio(HttpServletRequest request, Model model) throws Exception {
		
		return new ModelAndView("index");
	}
	
	@RequestMapping(path = { "auth-sample" }, method = RequestMethod.GET)
	public ModelAndView authSample(HttpServletRequest request, Model model) throws Exception {
		
		return new ModelAndView("auth-sample");
	}
	
	@RequestMapping(path = { "read-google-files-list" }, method = RequestMethod.GET)
	public ModelAndView drive(HttpServletRequest request, Model model) throws Exception {
		
		return new ModelAndView("read-google-files-list");
	}
	
	
}
