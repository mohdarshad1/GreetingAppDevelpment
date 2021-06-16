package com.GreetingAppRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GreetingAppModel.Greeting;

public interface IGreetingsRepository extends JpaRepository<Greeting, Long> {

}
