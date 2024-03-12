package eduDay5Chapter6;

//public Member {
	//private String name;
	//private int age;
	
	public Member() {
		this("guest");
		//System.out.println("Member() 생성자 실행");
	}
	
	public Member(String name) {
//		System.out.print("Member(String) 생성자 실행 : ");
//		System.out.println(name);
		//super();
//		this.name = name;
		this(name, 0);
	}
	
	public Member(String name, int age) {
		//System.out.print("Member(String) 생성자 실행 : ");
		//System.out.println(name + " : " + age);
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name= " + name + ", age=" + age + "]";
	}
//	public int getAge() {
//		return age;
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3= new Member("Amy", 23);
		System.out.println("m1: "+ m1);
		System.out.println("m2: "+ m2);
		System.out.println("m3: "+ m3);
	}


/*	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
		
	}
}
*/