package br.com.leofalves.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.leofalves.course.entities.Category;
import br.com.leofalves.course.entities.Order;
import br.com.leofalves.course.entities.User;
import br.com.leofalves.course.entities.enums.OrderStatus;
import br.com.leofalves.course.repositories.CategoryRepository;
import br.com.leofalves.course.repositories.OrderRepository;
import br.com.leofalves.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
				
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9090-9998", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "9090-9998", "123456");

		Order o1 = new Order(null, Instant.parse("2020-04-29T13:33:01Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2020-04-30T13:35:01Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2020-05-01T19:30:00Z"), OrderStatus.PAID, u1);

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));		
	}

}
