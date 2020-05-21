package ex01_xml1;

public class MessageBeanEnImpl implements MessageBean {
	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl 객체 생성");
	}
	public void sayHello(String name) {
		System.out.println("Hello!, "+name);
	}

}
