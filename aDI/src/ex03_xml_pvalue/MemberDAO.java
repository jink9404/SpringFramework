package ex03_xml_pvalue;

public class MemberDAO {
	private MemberBean member;
	
	public MemberDAO() {}

	//	(1) constructor 이용
	public MemberDAO(MemberBean member) {
		this.member = member;
	}
	//	(2) setter 이용
	
	public MemberBean getMember() {
		return member;
	}


	public void setMember(MemberBean member) {
		this.member = member;
	}

	
	public void insert() {
		System.out.println("DB : "+member.getName()
				+ "<"+member.getAge()+">"+member.getMessage()+" 내용을 입력합니다");
		
	}
}
