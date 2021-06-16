package com.GreetingAppService;

import com.GreetingAppConfigure.GreetingConfigure;
import com.GreetingAppModel.Greeting;
import com.GreetingAppModel.User;

public interface IGreetingService {

	String getMessage();

	String getMessage(User user);

	Greeting saveGreeting(GreetingConfigure greetingconfig);

	Greeting getGreeting(Long id);

}
