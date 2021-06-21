package com.authentication.jpaa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeResource {

	@GetMapping("/")
	@ResponseBody
	public String welcome() {
		return ("<h1>Welcome NoOne!</h1>");
	}
	
	@GetMapping("/user")
	@ResponseBody
	public String user() {
		return ("<h1>Welcome authenticated User!</h1>");
	}
	
	@GetMapping("/admin")
	@ResponseBody
	public String admin() {
		return ("<h1>Welcome authenticated Admin!</h1>");
	}
	
}
