package chapter5재귀알고리즘;

import java.util.Scanner;

public class Recur {
	static void recur(int n) {
//	while (n > 0) { //if (n>0)
		while (true) {
			if (n > 0) {
				s.push(n);//recur(n-1);
				n = n-1;
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();
				//pop()한 위치를 사용해서 다음 열을 조사하고 어 이상 없으면
//				이전 행으로 돌아가야
				System.out.println(n);
				n = n - 2; // recur (n-2);
				continue;
			}	
			else
				break;
//			recur(n - 1);
//			System.out.println(n); // n값 출력			
		}
	}

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		System.out.println("정수 입력");
		int x = std.nextInt();
		recur(x);
	}
}
