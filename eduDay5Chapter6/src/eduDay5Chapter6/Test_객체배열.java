package eduDay5Chapter6;

	//하나의 java file에 Student 객체를 정의하고 구현하는 실습
	/*
	 * static 멤버 함수 구현
	 * toString() 함수 구현과 사용
	 * 객체 배열 사용
	 */
	abstract class InterfaceStudents {
		public abstract void showObject();
	}
	class Student extends InterfaceStudents {
	 static int countStudents;//객체수
	 int sid;//학번
	 String sname; //학생 이름
	 String city; //주소 도시
	 
	 public Student() {//default 생성자
		 sid = 0; sname =null; city = null;
		 countStudents++;
	 }
	 public Student(int sid) {
		 //default 생성자 쓴 다음 생성자는 제일 간단한 int값만 주는 걸로 함. 
		 //sname ~ 이렇게 하면 중복코딩이라 없애야 하니 this로 해결함
		 this();
		 this.sid = sid;
		 //sname =  null; city = null;
		 //countStudents++;
	 }
	 public Student(int sid, String name, String city) {
		 this(sid);
		 this.sname = name;
		 this.city=city;
		 //main에서 
	 }
	 public String toString() {
		 return "sid="+sid + ", sname=" + sname + ", city=" + city;
	 }
	 public void showObject() {
		 System.out.println("["+sid +", " + sname + ", "+sid+", " + city+"]");
	 }
	 static void showNumberObjects() {//생성된 객체수를 출력한다.
		 System.out.println(" 생성객체수=" + countStudents);
	 }
	}
	class WorkStudent extends Student {
		String eno;
		String company;
		public WorkStudent() {
			
		}
		public WorkStudent(int sid, String sname, String city, String eno, String company) {
		//this.sid = sid;
		//this.sname = sname;
		//this.city=city;
		super(sid, sname, city);//constructor call must be the first statement in a constructor
		this.eno = eno;
		this.company = company;
	}
		@Override
		 public String toString() {
			 return super.toString() + "sid="+this.sid +", "+ "sname="+this.sname+", "+"city="+this.city;
			 
		 }
		@Override
		 public void showObject() {
			 //Student 출력 코드 추가
			super.showObject();
			 System.out.println("["+sid +", "+ sname+", "+city + "]");
		 }
	}
	class CodingWorkStudent extends WorkStudent {
		public CodingWorkStudent() {
			
		}
		String language;
		public CodingWorkStudent (int sid, String sname, String city, String eno, String company) {
		super (sid, sname, city, eno, company);
		this.language = language;
		}
		@Override
		 public String toString() {
			 return super.toString() + "eno="+this.eno;
		 }
		@Override
		 public void showObject() {
			 //WorkStudent 출력 코드 추가
			 super.showObject();
			 System.out.println("["+language+"]");
		 }
	}
	 // 생성자 구현한다.
	public class Test_객체배열 {
		 static void showObjects(InterfaceStudents is) {
			 is.showObject();
		 }
		 public static void main(String[] args) {
		 Student arry[] = new Student[10];
		 Student.showNumberObjects();
		 arry[0] = new Student();//parameter가 없으므로 default 생성자
		 arry[1] = new Student(202301);//정수값만 주는 거
		 arry[2] = new Student(202301,"Hong","Busan");
		 arry[3] = new WorkStudent(1234, "Hong","Busan","e1","naver");
		 arry[4] = new CodingWorkStudent(4321, "Kim", "Seoul","e2","daum");
		 arry[5] = new WorkStudent(6789, "Lee", "Daegu","e3","coupang");
		 Student.showNumberObjects();
		 for (Student s : arry) {
			 System.out.println(s.toString());
		 }
		 for (Student sx : arry) {
			 showObjects(sx);
		 }
	 }

	}
