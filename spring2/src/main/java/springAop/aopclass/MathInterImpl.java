package springAop.aopclass;

import org.springframework.stereotype.Component;

import springAop.interfaces.MathInter;

@Component
public class MathInterImpl implements MathInter {

	@Override
	public int add(int i, int j) {
		System.out.println(i+"+"+j+"="+(i+j));
		return i+j;
	}

	@Override
	public int sub(int i, int j) {
		System.out.println("i"+"-"+"j"+"="+(i-j));
		return i-j;
	}

	@Override
	public int mul(int i, int j) {
		System.out.println("i"+"*"+"j"+"="+(i*j));
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		System.out.println("i"+"/"+"j"+"="+(i/j));
		return i/j;
	}

}
