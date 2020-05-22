import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import aop1_xml.LoggingAdvice;
import aop1_xml.MessageBean;

public class MainApp {
	public static void main(String[] args) {
//		MessageBean 구현한 클래스의 모든 메소드를 호출
		ApplicationContext context = new GenericXmlApplicationContext("aop1_xml/applicationContext.xml");
		MessageBean bean = context.getBean("targetBean", MessageBean.class);
		bean.engSayHello();
	
		System.out.println("-----------------------------------------------------------------");
		bean.sayHello();
		System.out.println("-----------------------------------------------------------------");
		bean.test();
		System.out.println("-----------------------------------------------------------------");
	}
}
