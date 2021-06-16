package com.GreetingAppService;

import java.util.List;

import com.GreetingAppModel.Greeting;
import com.GreetingAppModel.User;

public interface IGreetingService {
	Greeting addGreeting(User user);

	Greeting getGreetingById(long id);

	List<Greeting> getAllGreetings();

	String deleteGreeting(long id);

	Greeting updateGreeting(long id, String message);
}
