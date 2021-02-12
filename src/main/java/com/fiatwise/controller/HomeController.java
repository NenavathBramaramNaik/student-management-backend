package com.fiatwise.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String home() {
		LOG.info("routing to swagger ui");
		return "redirect:swagger-ui.html";
	}

}
