package chapter2;


//메소드에 배열 전달 실습부터
//실습 설명한다 
//매개변수로 배열 전달

import java.util.Random;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class train_실습2_4메소드배열전달 {

	public static void main(String[] args) {
		int []data = new int[10]; //크기가 10인 정수배열 선언 10칸 만들음
		inputData(data); //배열에 데이터 입력
		showData(data); // 배열 데이터 출력
		
		int max = findMax(data); //최댓값 찾기
		System.out.println("\nmax = " + max); //최댓값 출력
		
		boolean existValue = findValue(data, 3); //배열에 값이 있는지 확인
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);
		//찾는 값 존재하는지 '여부' 출력
	}
	//배열 요소 출력 메소드
	static void showData(int[]data) {
		for (int num: data) {
			System.out.print(num+" ");
		}
	}
	//배열 난수 입력 메소드
	public static void inputData(int []data) {//교재 63 - 난수의 생성
		Random rand = new Random(); //Random 클래스의 객체 생성
		for(int i = 0; i<data.length; i++) // 배열 각 요소에 난수 입력
			data[i]=rand.nextInt(10); //0부터 9까지 난수 생성해서 배열에 저장
	}
	//최댓값 찾는 메소드
	static int findMax(int []items) {
		int max = 0;
		for(int i = 0; i < items.length; i++)
			//배열 돌면서 각 요소 확인
			if (items[i] > max)
				//찾는 값이 최댓값보다 큰지 확인
				max = items[i]; // 최댓값은 현재 요소로 업데이트
		
		return max; //배열 다 확인하고 최댓값 반환
	}
	
	static boolean findValue(int []items, int value) {
		//배열에서 특정값 찾는 메소드
		for(int i = 0; i<items.length; i++)//배열을 돌면서 각 요소 확인 
			if(items[i] == value) 	
				//현재 요소가 찾는값과 같은지 확인, 
				//값이 발견된다면 true를 반환하고 함수 종료
				return true; //true 반환

		return false;
		//배열 다 확인했지만 값 못 찾았을 경우
		//items[]에 value 값이 있는지를 찾는 알고리즘 구현

	}
}
