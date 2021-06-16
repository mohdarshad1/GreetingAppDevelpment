package com.GreetingAppService;

import com.GreetingAppModel.User;

public interface IGreetingService {

	String getMessage();

	String getMessage(User user);

}
