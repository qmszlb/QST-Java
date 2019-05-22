package hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		//加载配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得student对象
		Student stu = (Student) context.getBean("student");
		stu.sayHello();
	}

}
