package com.blackpineapple.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class MainPageController {

	private static final Logger	logger				= LoggerFactory.getLogger(MainPageController.class);


	/**
	 * Main Page
	 * 
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String bpbeta() {
		return "/views/bpschedule";
	}

}
