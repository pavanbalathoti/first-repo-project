package com.pavan.webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReplayController {

	@GetMapping("/replay")
	public String replaypage() {
		return "replay";
	}
}
