import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import demo.JavaBasedBeanConfiguration;
import demo.Player;
import demo.User;

public class SpringCoreDemo {

	public static void main(String[] args) {
		
		// first step is to create the spring core container
		ApplicationContext container = new ClassPathXmlApplicationContext("any-name.xml"); // first container
		
		// second step is ask the container for the bean object
		//User myUser = (User) container.getBean("user");
		User myUser = container.getBean("user", User.class); // here we never used the new keyword to create the User object
		
		// third step use the bean object
		//myUser.setFirstName("John"); // we can also tell the container to set firstName and lastName
		//myUser.setLastName("Smith");
		System.out.println("Full name : " + myUser.retrieveFullName());
		System.out.println(myUser);
		
		System.out.println("------------------------");
		// to verify the scope of the beans
		User secondUser = container.getBean("user", User.class);
		System.out.println("Full name : " + secondUser.retrieveFullName());
		System.out.println(secondUser);
		
		System.out.println("------------------------");
		secondUser.setContact(888888);
		System.out.println("myUser : " + myUser);
		System.out.println("secondUser : " + secondUser);
		
		System.out.println("------------------------");
		System.out.println("Working with annotation based configuration");
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml"); // second container
		Player firstPlayer = context.getBean("player", Player.class);
		
		//firstPlayer.setFirstName("John");
		//firstPlayer.setLastName("Carter");
		//firstPlayer.setSport("football");
		
		System.out.println(firstPlayer);
		
		System.out.println("------------------------");
		System.out.println("Working with java based configuration");
		ApplicationContext javaContainer = new AnnotationConfigApplicationContext(JavaBasedBeanConfiguration.class); // third container
		
		User thirdUser = javaContainer.getBean("user", User.class);
		System.out.println(thirdUser);
		
		
		
		
	}

}
