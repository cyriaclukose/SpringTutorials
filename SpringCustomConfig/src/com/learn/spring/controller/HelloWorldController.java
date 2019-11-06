package com.learn.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learn.spring.service.HelloWorldService;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

	@Autowired
	private HelloWorldService service;

	/**
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView welcome() {

		String message = service.getFirstWelcomeMessage();

		return new ModelAndView("welcome", "welcomemessage", message);
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "next", method = RequestMethod.GET)
	public ModelAndView welcomeNext() {

		String message = service.getSecondWelcomeMessage();

		return new ModelAndView("welcome", "welcomemessage", message);
	}

}
