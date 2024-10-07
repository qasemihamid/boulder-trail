package com.boulder.trail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageViewConstroller {
	
	@GetMapping(path = "/home")
	public String getHomePage() {
		return "BoulderTrailHome/home";
	}
	
	@GetMapping(path = "/home.js")
	public String getHomePageJs() {
		return "BoulderTrailHome/home.js";
	}
	
	@GetMapping(path = "/home.css")
	public String getHomePageCss() {
		return "BoulderTrailHome/home.css";
	}

}
