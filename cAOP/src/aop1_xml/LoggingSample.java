package aop1_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingSample {
	public void before(JoinPoint p) {
		System.out.println("before: 메소드 호출 전--------------------------------");
	}
	
	public void after(JoinPoint p) {
		
	}
	
	public Object around(ProceedingJoinPoint p) throws Throwable {
		Object obj;
		obj = p.proceed();
		return obj;
	}
	
	public void afterReturning(JoinPoint p){
		System.out.println("after : 예외처리가 없는경우 ");
	}
}
