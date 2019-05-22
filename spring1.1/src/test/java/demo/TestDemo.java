package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	public static void main(String[] args) {
//		//1、创建业务对象person
//		Person person = new Person();
//		person.setName("小明");
//		//2、创建业务对象person所依赖的对象car
//		Car car = new Car();
//		car.setBrand("法拉利");
//		//3、把依赖对象和业务对象组合起来
//		person.setCar(car);
		
		
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得业务对象person
		Person person = (Person) ac.getBean("person");
		
		//4、业务操作
		person.goHome();

	}

}
