package eduDay16Chapter14;


interface Calculator {
	int func();
}

public class Test09 {
	
	static int num1 = 10;
	int num2 = 20;
	
	public static void main(String[] args) {
		Test09 test = new Test09();
		int num3 = 30;
		//테스트는 수정이 안되는데 그 안에 있는 필드는 수정이 가능함. 
		//밑에 주석처리된 거처럼 test 값을 다시 할당시킬 순 없다는 의미임.
		
		Calculator calc = () -> {
			int num4 = 40;
			Test09.num1++;
			test.num2++;
//			num3++; //오류 발생

//			test = new Test09()
			num4++;
			return num4;
		}; System.out.println("뭐라도 출력해보세요 정상이라면");
	}
}
