package ex04_xml_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex04_xml_list/applicationContext.xml");
		
		ListBean bean = (ListBean)context.getBean("bean");
		for(Integer i : bean.getIntList()) {
			System.out.println(i);
		}
		for(MemberBean m : bean.getMemberList()) {
			System.out.println(m.getMessage());
		}
	}

}
