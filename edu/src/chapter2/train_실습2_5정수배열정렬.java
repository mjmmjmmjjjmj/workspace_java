package chapter2;

import java.util.Arrays;
//교재 67 - 실습 2-5
//2번 실습
import java.util.Random;

public class train_실습2_5정수배열정렬 {

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		System.out.println("원본 데이터 : ");
		showData(data);

		reverse(data);//역순으로 재배치 - 정렬 아님 (배열을 다시 섞음)
		System.out.println("\n역순으로 재배치: ");
		showData(data);
		
		//*//
		sortData(data);
		System.out.println("\n오름차순 정렬: ");
		showData(data);
		//*/

		reverseSort(data);//내림차순
		System.out.println("\n내림차순 정렬: ");
		showData(data);
		
		Arrays.sort(data); //sort(integer) //직접 ㄱ코딩 아닌 자바 라이브러리 이용
		System.out.println("\n자바 라이브러리 이용한 정렬 :");
		showData(data);
	}
	
	static void showData(int[]data) {//배열 요소 출력 메소드
		for(int num : data) {
			System.out.println(num + " ");
		}
	}
	
	static void inputData(int []data) {//배열 난수 입력 메소드
		Random rand = new Random();
		for(int i = 0; i< data.length; i++)
			data[i]=rand.nextInt(50); //0~19
		
	}
	
	static void swap(int[]arr, int ind1, int ind2) {//교재 67페이지
		int t = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = t;
	}
	
	static void sortData(int []arr) { //오름차순 정렬
		//Arrays.sort(arr);//사실 이 한줄만 있어도 되는데 일일이 비효율적으로 하려면 ↓
		for (int i = 0; i<arr.length; i++)
			for (int j = 0; j<arr.length; j++)
				if(arr[i]<arr[j]) 
					swap(arr, i, j);
				
	}
	
	static void reverse(int[] a) {//교재 67페이지 // 배열을 역순으로 재배치
		for (int i = 0; i < a.length/2; i++)
			swap(a, i, a.length-i-1);  // 배열의 앞과 뒤 요소를 교환
	}
	
	static void reverseSort(int []arr) { //내림차순 정렬
//		Arrays.sort(arr); //이것도 사실 이 2줄만 있어도 됨.
//		reverse(arr);
		for (int i = 0; i<arr.length; i++)
			for (int j = 0; j<arr.length; j++)
				if(arr[i]>arr[j]) {
					swap(arr, i, j);
				}
	}
}
