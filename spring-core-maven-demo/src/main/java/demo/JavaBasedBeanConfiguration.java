package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="demo")
public class JavaBasedBeanConfiguration {

	// here we configure the beans
	@Bean(name = "user")
	public User getUser() {
		return new User("test1", "test2", 66666, getAddress());
	}
	
	@Bean(name = "address")
	public Address getAddress() {
		return new Address("St.louis", "MS", 36057);
	}
	
	
	
}
