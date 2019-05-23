package springTransaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springTransaction.controller.UserController;

public class TestSpringTransaction {
	
	@Test
	public void testSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springTransaction/applicationContext-transaction.xml");
		UserController userController = (UserController) ctx.getBean("userController");
		userController.test();
	}
}
