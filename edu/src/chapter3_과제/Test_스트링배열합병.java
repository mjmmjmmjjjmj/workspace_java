package chapter3_과제;

import java.util.Arrays;

public class Test_스트링배열합병 {

    static void showList(String topic, String [] list) {
    	System.out.println(topic + ": ");
    	for(String item : list) {
    		System.out.println(item + " ");
    	}
    	System.out.println();
    }
    static String[] mergeList(String[]s1, String[] s2) {
    	int i = 0, j = 0,k =0;
    	String[] s3 = new String[10];
    	
    	do {
    		if (i<s1.length && j<s2.length) {
    			if (s1[i].compareTo(s2[j]) < 0 ) {
    				s3[k++] = s2[j++];
    			} else { 
    				s3[k++] = s2[j++];
    			}
    		} else if (i < s1.length) {
        			s3[k++] = s1[i++];
        		}else {
        			s3[k++] = s2[j++];
        		}
    		} while(k < s3.length);
    		
    	return s3;
    }
    public static void main(String[] args) {
	String[] s1 = { "홍길동", "강감찬", "을지문덕", "계백", "김유신" };
	String[] s2 = {"독도", "울릉도", "한산도", "영도", "우도"};
	Arrays.sort(s1);
	Arrays.sort(s2);
	
	showList("s1배열 = ", s1);
	showList("s2배열 = ", s2);

	String[] s3 = mergeList(s1,s2);
	showList("스트링 배열 s3 = s1 + s2:: ", s3);
}
}
