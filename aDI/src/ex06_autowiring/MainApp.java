package ex06_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex06_autowiring/applicationContext.xml");
		
		MessageBean bean = (MessageBean)context.getBean("message");
		bean.sayHello();
	}

}
