package eduDay6Chapter7;

public class Professor extends person {
	private String subject;
	public Professor(String name, int age, String subject) {
		// TODO Auto-generated constructor stub
		super(name, age);
		this.subject = subject;
		System.out.println("Professor 생성자");
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	 @Override
	public String toString() {
		return super.toString() + ":"+subject;
	}

}
