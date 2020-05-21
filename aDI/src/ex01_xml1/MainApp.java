package ex01_xml1;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:ex01_xml1/applicationContext.xml");//new ClassPathXmlApplicationContext("ex01_xml1/applicationContext.xml");
		System.out.println("start");
		MessageBean bean = context.getBean("en", MessageBean.class);
		bean.sayHello("홍길동");
		MessageBean bean1 = context.getBean("ko", MessageBean.class);
		bean1.sayHello("홍길숙");
		
		MessageBean bean2 = context.getBean("en", MessageBean.class);
		bean2.sayHello("홍길동");
		MessageBean bean3 = context.getBean("ko", MessageBean.class);
		bean3.sayHello("홍길숙");
		
		
		
	}

		
}
