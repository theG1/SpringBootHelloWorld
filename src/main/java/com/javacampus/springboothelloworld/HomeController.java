
package com.javacampus.springboothelloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HomeController {
    @RequestMapping(value="/home", method=RequestMethod.GET)
	public String index() {
		return "Hello World with Spring Boot";
	}
}
