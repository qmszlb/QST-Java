package springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAop.aopclass.MathInterImpl;
import springAop.interfaces.MathInter;

public class TestSpringAop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springAop/applicationContext.xml");
		MathInter mathInter = (MathInter) context.getBean("mathInterImpl");
		mathInter.add(10, 2);
		mathInter.sub(10, 2);
	}

}
