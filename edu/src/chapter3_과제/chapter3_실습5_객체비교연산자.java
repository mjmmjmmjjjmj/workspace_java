package chapter3_과제;

import java.util.Arrays;
import java.util.Comparator;

class PhyscData3 {
	public PhyscData3(String name, int height, double vision) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	String name;
	int height;
	double vision;

}
class NameOrderComparator2 implements Comparator<PhyscData3>{
	public int compare(PhyscData3 p1, PhyscData3 p2) {
		if (p1.name.compareTo(p2.name)>0) return 1;
		else if (p1.name.compareTo(p2.name)<0) return -1;
		else {
			return 0;
		}
	}
}

class HeightOrderComparator2 implements Comparator<PhyscData3>{
	public int compare(PhyscData3 p1, PhyscData3 p2) {
		if (p1.height>p2.height) 
			return 1;
		else if (p1.height<p2.height) return -1;
		else {
			return 0;
		}
	}
}

class visionOrderComparator2 implements Comparator<PhyscData3>{
	public int compare(PhyscData3 p1, PhyscData3 p2) {
		if (p1.vision>p2.vision) return 1;
		else if (p1.vision<p2.vision) return -1;
		else {
			return 0;
		}
	}
}

public class chapter3_실습5_객체비교연산자 {
	static final Comparator<PhyscData3> HEIGHT_ORDER = new HeightOrderComparator2();

	public static void main(String[] args) {
		PhyscData3[] data = {
				new PhyscData3("홍길동", 162, 0.3),
				new PhyscData3("홍동", 164, 1.3),
				new PhyscData3("홍길", 152, 0.7),
				new PhyscData3("김홍길동", 172, 0.3),
				new PhyscData3("길동", 182, 0.6),
				new PhyscData3("길동", 167, 0.2),
				new PhyscData3("길동", 167, 0.5),
		};
		showData("정렬전 객체 배열", data);
		Arrays.sort(data, HEIGHT_ORDER);
		
		showData("정렬후 객체 배열", data);
		PhyscData3 key = new PhyscData3("길동", 167, 0.2);
		Arrays.binarySearch(data, key, HEIGHT_ORDER);
		int idx = Arrays.binarySearch(data, key, HEIGHT_ORDER);
		System.out.println("\nArrays.binarySearch(): result = " + idx);
	}

	private static void showData(String name, PhyscData3[] data) {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(PhyscData3 datum : data){
			System.out.println(datum.name + ", "+ datum.height+", "+ datum.vision);
		}
			
		
	}

}
