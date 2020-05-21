package ex06_autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String message;
	
	@Autowired
	@Qualifier("outputer2")
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
