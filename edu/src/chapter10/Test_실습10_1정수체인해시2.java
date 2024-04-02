package chapter10;

import java.util.Scanner;

//체인법에 의한 해시
//--- 해시를 구성하는 노드 ---//

class Node2 {
	private int key; // 키값
	Node2 next; // 뒤쪽 포인터(뒤쪽 노드에 대한 참조)

	Node2(int key) {
		this.key = key;
		this.setNext(null);
	}

	int getKey() {
		return key;
	}
/*
	public int hashCode() {
		return key * key * 83;// 왜 들어간 건지 모르겠음 : 주소 계산을 위해서 있는 거임
	}
*/
	public Node2 getNext() {
		return next;
	}

	public void setNext(Node2 next) {
		this.next = next;
	}

}

class SimpleChainHash2 {
	private int size; // 해시 테이블의 크기
	private Node2[] table; // 해시 테이블

	SimpleChainHash2 () {
		this.size = size;
		this.table = null;
	}
	int getSize() {
		return size;
	}
	public SimpleChainHash2(int capacity) {
		try {
			table = new Node2[capacity];
			this.size = capacity;
		}catch (OutOfMemoryError e) {
			this.size = 0;
		}
	}
	public int hashValue(int key) {
		return (key * key * 83) % size;
	}

//--- 키값이 key인 요소를 검색(데이터를 반환) ---//
	public int search(int key) {

		int hash = hashValue(key);
		Node2 p = table[hash];
		
		while(p != null) {
			if (p.getKey() == key)
				return 1;
			p = p.next;
		}
		return -1;

	}

	// --- 키값이 key인 데이터를 data의 요소로 추가 ---//
	public int add(int key) {
		int hash = hashValue(key);
		Node2 p = table[hash];
		Node2 temp = new Node2(key);
		while(p != null) {
			if(p.getKey() == key) {
				return 1;
			}
			p = p.next;
		}
		temp.next = table[hash];
		table[hash] = temp;
		return 0;

	}

	// --- 키값이 key인 요소를 삭제 ---//
	public int delete(int key) {
		int hash = hashValue(key);
		Node2 p = table[hash];
		Node2 pp = null;
		
		while(p != null) {
			if (p.getKey() == key) {
				if(pp == null) {
				table[hash] = p.next;
			} else {
				pp.next = p.next;
				return 0;
			}
			pp = p;
			p = p.next;
			}
		}
		return 1;
	}

	// --- 해시 테이블을 덤프(dump) ---//
	public void dump() {
		for (int i = 0; i < size; i++) {
			Node2 p = table[i];
			System.out.printf("[%d] ", i);
			while (p != null) {
				System.out.printf(" %d ->",p.getKey());
				p = p.next;
			}
			System.out.println();
		}
	}

}

public class Test_실습10_1정수체인해시2 {

	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), Show("출력"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

//체인법에 의한 해시 사용 예
	public static void main(String[] args) {
		Menu menu;
		SimpleChainHash2 hash = new SimpleChainHash2(11);
		Scanner stdIn = new Scanner(System.in);
		int select = 0, result = 0, val = 0;
		final int count = 15;
		do {
			switch (menu = SelectMenu()) {
			case Add:

				int[] input = new int[count];
				for (int ix = 0; ix < count; ix++) {
					double d = Math.random();
					input[ix] = (int) (d * 20);
					System.out.print(" " + input[ix]);
				}
				for (int i = 0; i < count; i++) {
					if ((hash.add(input[i])) == 1)
						System.out.println("Insert Duplicated data");
				}
				break;
			case Delete:
				// Delete
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.delete(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;
			case Search:
				System.out.println("Search Value:: ");
				val = stdIn.nextInt();
				result = hash.search(val);
				if (result == 1)
					System.out.println(" 검색 데이터가 존재한다");
				else
					System.out.println(" 검색 데이터가 없음");
				System.out.println();
				break;

			case Show:
				hash.dump();
				break;
			}
		} while (menu != Menu.Exit);

	}
}
