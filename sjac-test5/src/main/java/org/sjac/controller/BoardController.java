package org.sjac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("home.do")
	public String home(){
		return "home";
	}
}
