/**
 * 
 */
package com.dmedragh.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmedragh.beans.Welcome;

/**
 * @author dmedragh
 *
 */
@Controller
public class WelcomeController {
	
	public static String welcomeMsg = "Welcome Mr. %s!";

	/**
	 * 
	 */
	public WelcomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/welcome/user")
	@ResponseBody
	public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java fun") 
		String name) {
		
		return new Welcome(String.format(welcomeMsg, name));
	}

}
