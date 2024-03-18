package chapter3_과제;

//comparator 구현 실습
/*
* 교재 121 실습 3-6 
* 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
* 함수(메소드) 전체를 작성하는 훈련 
*/

import java.util.Arrays;

public class chapter3_실습3_스트링배열정렬이진탐색 {
	static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void sortData(String[] arr) {
		for (int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if (arr[i].compareTo(arr[j])>0) {
					swap(arr, i, j);
				}
			}
		}
	}
	static void reverse(String[] arr) {//교재 67페이지
		for (int i = 0; i < arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
		}
	}
	static int linearSearch(String[] arr, String key) {
		for (int i = 0; i<arr.length; i++) {
			if(arr[i].equals(key)) {
				return i;
			}
		}
		return -1;
		
	}
	
	static int binarySearch(String[] arr, String key) {
		int start = 0;
		int end = arr.length-1;
		
		do {
			int mid = (start + end)/2;
			if(arr[mid].compareTo(key)==0) {
				return mid;
			}else if
			(arr[mid].compareTo(key)<0) {
				start = mid +1;
			}else {
				end = mid -1;
			}
		}while (start <= end);
		return -1;
		
	}
	static void showData(String msg, String []arr) {
		System.out.println(msg);
		for(String data : arr) {
			System.out.println(data + "");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String []data = {"사과","포도","복숭아", "감", "산딸기", "블루베리", "대추", "수박", "참외"};//홍봉희 재배 과수

		showData("정렬전", data);
		sortData(data);
		showData("정렬후", data);
		reverse(data);//역순으로 재배치
		showData("역순 재배치후", data);
		Arrays.sort(data);//Arrays.sort(Object[] a);
		showData("Arrays.sort()로 정렬후",data);
      
		String key = "포도";
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(포도): result = " + resultIndex);

		key = "배";
		/*
		 * 교재 109~113
		 */
		resultIndex = binarySearch(data, key);
		System.out.println("\nbinarySearch(배): result = " + resultIndex);
		key = "산딸기";
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(산딸기): result = " + resultIndex);

	}
}
