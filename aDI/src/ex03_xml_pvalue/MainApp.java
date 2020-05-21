package ex03_xml_pvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex03_xml_pvalue/applicationContext.xml");

		MemberDAO dao = context.getBean("dao", MemberDAO.class);
		dao.insert();
		
	}
}


