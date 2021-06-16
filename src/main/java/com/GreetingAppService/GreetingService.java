package com.GreetingAppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GreetingAppConfigure.GreetingConfigure;
import com.GreetingAppModel.Greeting;
import com.GreetingAppModel.User;
import com.GreetingAppRepository.IGreetingsRepository;

@Service
public class GreetingService implements IGreetingService {
	@Override
	public String getMessage() {
		return "Hello World!!";
	}

	@Override
	public String getMessage(User user) {
		if (user == null) {
			return "Hello World";
		} else if (user.getFirstName() == null) {
			user.setFirstName("");
			return "Hello " + user.getLastName();
		} else if (user.getLastName() == null) {
			user.setLastName("");
			return "Hello " + user.getFirstName();
		} else {
			return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
		}
	}

	@Autowired
	IGreetingsRepository greetingrepository;

	@Override
	public Greeting saveGreeting(GreetingConfigure greetingconfig) {
		Greeting greeting = new Greeting(greetingconfig);
		greeting = greetingrepository.save(greeting);
		return greeting;
	}

	@Override
	public Greeting getGreeting(Long id) {
		return greetingrepository.findById(id).orElseGet(null);
	}
}