package ex06_autowiring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String message;
	
//	@Autowired			//생성자나 setter가 없이 DI(주입)해 주는 어노테이션
//	@Qualifier("outputer2")//동일한 클래스의 빈이 여러개인 경우 선택하는 어노테이션
	@Resource(name = "outputer2") // = @Autowired + @Qualifier("outputer2")
	private Outputer outputer;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public void sayHello() {
		System.out.println(name+"님께"+message);
		try {
			outputer.write(message);
		} catch (Exception e) {
			System.out.println("MessageBeanImpl"+e.toString());
		}
	}

}
