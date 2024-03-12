package practice;

import java.util.Scanner;

public class practice120240208 {
//2g, 3g, 5g의 추가 각각 10개씩 있을 때, 10~100 사이의 임의의 값을 입력받고,
//추의 합이 입력받은 값이 되는 경우를 찾아서 출력하세요. 단, 각각의 추는 1개 이상은 사용되어야 합니다. 
//출력 예
//입력값 : 31
//출력값 :
	//(1,3,4)(1,8,3)(2,4,3)(3,5,2)(4,1,4)(4,6,1)(5,2,3)(6,3,2)(7,4,1)(9,1,2)(10,2,1):11
	//추가된 기능 : if(num == 0) break;
	//public static void main(String[] args) {	
	//변수 생성
	//Scanner sc = new Scanner(System.in);
	//int num=sc.nextInt();
	//for (int i=10; i<101; i++) {
	//System.out.print(num);	}
	//갯수 계산
	//	int o = num/5;
	//	int sam = num/3;
		//	int ee = num/2;
		//총 추의 갯수
//교수님 답
	static int getNumber(Scanner sc) {
		int num;
		do {
			System.out.print("10~100사이 정수 :");
			num=sc.nextInt();
		} while (num !=0 &&(num < 10 || 100 < num));
		return num;
	}
	public static int calc(int a, int b, int c) {
		
	}
		
}
