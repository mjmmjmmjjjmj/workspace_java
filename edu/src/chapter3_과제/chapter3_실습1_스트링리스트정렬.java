package chapter3_과제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class chapter3_실습1_스트링리스트정렬 {

    public static String[] removeElement1(String[] arr, String item) {
		//현재 배열에서 중복 제거하려고 코드가 길어진다
		//배열을 리스트로 변환 > list.remove();
		//삭제된 리스트를 배열로 변환하여 리턴
    	List<String> list = new ArrayList<>();
    	for(int i = 0; i<arr.length; i++) {
    		String str = arr[i];
    	list.add(str);
    	}
    	list.remove(item);
    	return list.toArray(String[]::new);
    	//풀어서 이렇게 쓸 수 있음
//    	 String[] result = new String[list.size()];
//    	    for (int i = 0; i < list.size(); i++) {
//    	        result[i] = list.get(i);
//    	    }
//    	    return result;
    }
    
    static void getList(List<String> list) {
		list.add("서울");	list.add("북경");
		list.add("상해");	list.add("서울");
		list.add("도쿄");	list.add("뉴욕");


		list.add("런던");	list.add("로마");
		list.add("방콕");	list.add("북경");
		list.add("도쿄");	list.add("서울");

		list.add(1, "LA");
    }
    static void showList(String topic, List<String> list) {
    	System.out.println(topic + "::");
//    	for(in_t i = 0;)
    	for(String st: list) {
    		System.out.println(st);
    	}
    }
    static void sortList(List<String> list) {
    	//방법1 list.sort(null);
    	//방법2 리스트를 스트링 배열로 전환
    	list.sort(null);
    }
    
    static String[] removeDuplicateList(List<String> list) {
    	
    	//리스트를 배열로 변환 > 배열에서 중복을 찾느다
	    String cities[] = new String[0];
	    cities = list.toArray(cities);
	    //list를 배열 cities[]로 변환
	    //for문으로 도시가 중복인 걸 체크 = compareTo를 사용해서
	    List<String> cityList = new ArrayList<>();
	    int count = cities.length;
	    for(int i = 0; i<count; i++) {
	    	int j = i + 1;
	    	while(j < count) {
	    		if (cities[i].equals(cities[j])) {//배열에서 중복 검사하여 참이면
	    			cities = removeElement1(cities, cities[j]); //배열 전달
	    		}
	    		j++;
	    	}
	    }
	    if() {//배열에서 중복 검사해서 참이면
	    	removeElement1(cities, city);  //중복 제거를 위해 배열 전달
	    }
	    removeElement1(cities, city);
	    
	    return city;
    }
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		getList(list);
		showList("입력후", list);
		//sort - 오름차순으로 정렬, 내림차순으로 정렬, 중복 제거하는 코딩

//	    Collections.sort(list);

//배열의 정렬
		sortList(list);
	    System.out.println();
	    showList("정렬후", list);
//배열에서 중복제거
	    System.out.println();
	    System.out.println("중복제거::");
	  
	    String[] cities = removeDuplicateList(list);
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(cities));
	    showList("중복제거후", lst);
	}
}
