package com.devglan.Userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserPortalApplication  implements CommandLineRunner
{
    @Autowired
    private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

	    repository.save(new User("aymen","braiek","aymen@gmail.com"));
        repository.save(new User("aymen1","braiek","aymen@gmail.com"));
        repository.save(new User("aymen2","braiek","aymen@gmail.com"));


    }
}
