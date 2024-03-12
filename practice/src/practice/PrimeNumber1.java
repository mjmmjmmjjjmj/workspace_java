package practice;

import java.util.Scanner;

public class PrimeNumber1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		
		boolean result = isPrime(n);
		
		if (result == true) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

	public static boolean isPrime(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
//			
//			if(n%i == 0) {
//				if(n/i == 1)
//				System.out.println("소수입니다.");
//			} else {
//				System.out.println("소수가 아닙니다.");
//			}
//		return n;
//	}
//}
//exception이 나게됨 만약 0으로 나눠지면
//2부터 시작해서 
