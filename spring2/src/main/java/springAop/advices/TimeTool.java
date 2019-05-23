package springAop.advices;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeTool {
	
	//@Pointcut("execution(int add(int, int))")
//	@Pointcut("execution(* add(*, *))")
	@Pointcut("execution(* add(..))")
	public void myPointCut() {
		
	}
	
	@Before("myPointCut()")
	//@Before("execution( * add(..))")
	public void runBeforeMethod() {
		System.out.println("前置通知>>>>>>>>>>>>>>>>>>>>>>>"+new Date());
	}
	
//	@After("execution(public int springAop.aopclass.MathInterImpl.add(int, int))")
//	@After("myPointCut()")
	public void runAfterMethod() {
		System.out.println("后置通知>>>>>>>>>>>>>>>>>>>>>>>"+new Date());
	}
}
