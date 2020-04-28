package br.com.leofalves.course.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.leofalves.course.entities.User;
import br.com.leofalves.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com","9090-9998", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com","9090-9998", "123456");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

	
	
}
