package chapter9;

//단순한 linked list에서 insert, delete하는 알고리즘을 코딩: 1단계

import java.util.Random;
import java.util.Scanner;

class Node1 {
	int data;
	Node1 link;

	public Node1(int element) {
		data = element;
		link = null;
	}
}

class LinkedList1 {
	Node1 first;

	public LinkedList1() {
		first = null;
	}

	public int Delete(int element) // delete the element
	{	Node1 q, current = first;
	q = current;
	if(first == null) {
		return -1;
	}
	if(first.data == element) {
		first = first.link;
		return current.data;
	}
	while(current != null && current.data != element) {
		q = q.link;
		current = current.link;
	}
	if (current == null) {
		return -1;
	}
	q.link = current.link;
	return current.data;
	//		return -1;// 삭제할 대상이 없다.
	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		Node1 p = first;
		int num = 0; //노드의 번호
		if(p == null) {
			System.out.println("no data");
		}
		//p가 null이 될 때까지 순회하면서 출력
		else {
			while(p != null) {
				num++;
				System.out.println("Node"+num+":"+p.data);
				p = p.link;
			}
		}
	}

	public void Add(int element) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{Node1 newNode = new Node1(element);
	if(first == null) {//리스트가 비어잇을 때
		first = newNode; // 첫 번째 게 newNode가 됨.
		return;
	}
	Node1 p = null, q = first; //p는 이전 노드, q는 현재 노드
	while(q != null && element >q.data) { 
		//오름차순으로 정렬된 위치 찾기
		//q 안에 값이 있다는 전제 하에 
		//새로 넣을 값이 q에 있던 데이터보다 크면
		p = q; //p는 q의 이름표를 달게 됨
		q = q.link; //q는 자기 다음 걸 가르키는 q.link이름표 달게됨 
	} //(element < q.data ) //새로 넣을 값이 q에 있던 데이터보다 작고
	if(p == null) { //p가 첫 번째 노드보다 작은 값이라 안에 뭐가 없는 경우
		newNode.link = first; //새로운 노드가 첫 번째 노드가 되도록 설정
		first = newNode;
	} else {//p가 비어있지 않아서 중간에 노드를 삽입해야 할 경우
		p.link = newNode; //newNode에 p랑 q 사이의 p.link 이름표 붙여줌
		newNode.link=q; //그럼 newNode 다음의 newNode link는 q이름표를 붙여주면 됨
	}
	}
	//	p.link = newNode;

	public boolean Search(int data) { // 전체 리스트를 순서대로 출력한다.
		Node1 ptr = first;
		while(ptr != null) {
			if(ptr.data == data) {
				return true;
			}
			ptr = ptr.link;
		}
		return false;
	}
}

public class 실습9_1정수연결리스트 {
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		// "Add" 상수가 정의될 때 Menu("삽입") 생성자가 호출되어 message 필드가 "삽입"으로 초기화
		// 생성자는 각 상수가 정의될 때 호출되며, 해당 상수의 message 필드를 초기화하는 역할
		// enum 상수가 언제 정의되는가를 찾아 보아야 한다
		Menu(String string) { // 생성자(constructor)가 언제 호출되는지 파악하는 것이 필요하다
			message = string;
			System.out.println("\nMenu 생성자 호출:: " + string);
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
			for (Menu m : Menu.values()) {// Menu 생성자가 호출됨
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // 메뉴 참조 변수일 뿐이다
		Random rand = new Random();
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		int count = 10;
		int data = 0;
		l.Show();
		do {
			switch (menu = SelectMenu()) {// Menu 생성자 호출 - menu 객체를 리턴한다
			case Add:
				for(int i = 0; i<count; i++) {
					data = rand.nextInt(100);
					l.Add(data);
					}
				System.out.print("삽입후 리스트: ");
				l.Show();
				break;
			case Delete:
				data = sc.nextInt();
				int num = l.Delete(data);
				System.out.println("삭제된 데이터는 " + num);
				break;
			case Show:
				l.Show();
				break;
			case Search: // 회원 번호 검색
				int n = sc.nextInt();
				boolean result = l.Search(n);
				if (!result)
					System.out.println("검색 값 = " + n + " 데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + n + " 데이터가 존재합니다.");
				break;
			case Exit:
				break;
			}
		} while (menu != Menu.Exit);
	}
}
