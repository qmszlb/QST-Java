package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
  public static void main(String[]args){
	  ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
      Courses courses = (Courses) ac.getBean("courses");
      courses.Teach(); 
}
}

