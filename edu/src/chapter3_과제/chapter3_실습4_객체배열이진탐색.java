package chapter3_과제;
/*
 * Comparable 구현
 */
/*
 * 함수(메소드)에 parameter 전달 방식을 표현하는 능력의 숙달 훈련
 * 함수(메소드) 전체를 작성하는 훈련 
 */
import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;

	public PhyscData2(String string, int i, double d) {
		//파라미터 3개, 
		this.name = string;
		this.height = i;
		this.vision = d;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return name;
		
	}
	@Override
	public int compareTo(PhyscData2 p) {
		return height;
		
	}
	public int equals(PhyscData2 p) {
		return height;
		
	}
}
public class chapter3_실습4_객체배열이진탐색 {
	static void swap(PhyscData2[] arr, int i, int j) {
		PhyscData2 temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void showData (String message, PhyscData2[] arr) {
		System.out.println(message);
		for(PhyscData2 data : arr) {
			System.out.println(data);
		}
			System.out.println();
	}
	
	static void sortData (PhyscData2[] arr) {
		for(int i =0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	static void reverse (PhyscData2 [] arr) { 
		for(int i = 0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
		}
	}
	
//	static void reverseSort (PhyscData2 [] arr) {
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					swap(arr, i, j);
//				}
//			}
//		}
//	}
	
	static int linearSearch (PhyscData2 []arr, PhyscData2 key) {
		for (int i = 0; i<arr.length; i++) {
			if (arr[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	static int binarySearch(PhyscData2 []arr, PhyscData2 key) {
		int start = 0;
		int end = arr.length -1;
		
		do {
			int mid = (start + end) /2;
			if(arr[mid].compareTo(key) == 0) {
				return mid;
			} else if
				(arr[mid].compareTo(key) < 0) {
				start = mid +1;
			} else {
				end = mid -1;
			}
		} while (start <= end) ;
		return -1;
	}
	
			//확장형 for문으로 인덱ㄱ그가 
	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("나동", 164, 1.3),
				new PhyscData2("최길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("박동", 182, 0.6),
				new PhyscData2("이동", 167, 0.2),
				new PhyscData2("길동", 167, 0.5),
		};
//		Arrays.binarySearch(null, null, null)
		showData("정렬전", data);
		sortData(data);
		showData("정렬후", data);
		reverse(data);
		showData("역순 재배치후", data);
		Arrays.sort(data);//사용된다 그 이유는?
		showData("Arrays.sort() 정렬후", data);
		
		PhyscData2 key = new PhyscData2("길동", 167, 0.2);
		int resultIndex = linearSearch(data, key);
		System.out.println("\nlinearSearch(<길동,167,02>): result = " + resultIndex);
		
		key = new PhyscData2("박동", 182, 0.6);
		/*
		 * 교재 109~113
		 */
		resultIndex = binarySearch(data, key);//comparable를 사용
		System.out.println("\nbinarySearch(<박동,182,0.6>): result = " + resultIndex);
		key = new PhyscData2("이동", 167, 0.6);
		/*
		 * 교재 115 Arrays.binarySearch에 의한 검색
		 */
		resultIndex = Arrays.binarySearch(data, key);//comparable를 사용
		System.out.println("\nArrays.binarySearch(<이동,167,0.6>): result = " + resultIndex);
	}
	
	
}
