package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotation.controller.CourseController;

public class TestAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation/spring-annotation.xml");
		CourseController courseController = (CourseController) context.getBean("courseController");
		courseController.getCourses();
	}

}
