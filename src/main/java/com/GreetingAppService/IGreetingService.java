package com.GreetingAppService;

import com.GreetingAppModel.Greeting;
import com.GreetingAppModel.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
}
