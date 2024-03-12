package eduDay6Chapter7;

public class LMSTest2 {
	public static void main(String[] args) {
		
		Professor p = new Professor("홍길동", 40, "자바");
		
		p.setName("홍길동");
		p.setAge(40);
		p.setSubject("자바");
		
		System.out.println(p.toString());
		
}
	
}
