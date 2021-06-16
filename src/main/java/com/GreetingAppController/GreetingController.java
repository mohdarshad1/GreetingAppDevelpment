package com.GreetingAppController;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GreetingAppConfigure.GreetingConfigure;
import com.GreetingAppModel.Greeting;
import com.GreetingAppModel.User;
import com.GreetingAppService.IGreetingService;


/*
 * @RestController annotation indicates that a particular class
 * serves the role of a controller which can handle REST API calls.
 * 
 * @RequestMapping annotation is used for URL Mappings.
 * 
 * @Autowired annotation can be used to autowire bean on the setter method
 * @Autowired annotation in spring automatically injects the dependent beans into the associated references of a POJO class. 
 * This annotation will inject the dependent beans by matching the data-type 
*/
@RestController
@RequestMapping("/greeting")
public class GreetingController {

	@Autowired
	private IGreetingService greetingService;

	@RequestMapping("/get")
	public String greetingMessage() {
		return greetingService.getMessage();
	}

	@PostMapping("/post")
	public String greetUser(@RequestBody User user) {
		return greetingService.getMessage(user);
	}

	@PostMapping("/save")
	public ResponseEntity<Greeting> saveGreeting(@Valid @RequestBody GreetingConfigure greetingconfig) {
		Greeting greeting = greetingService.saveGreeting(greetingconfig);
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}
}