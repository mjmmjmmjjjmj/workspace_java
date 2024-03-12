package eduDay7Chapter8;


class Node3 {
	int data;//노드의 데이터
	Node3 link;//다음 노드를 가리키는 링크
	//노드를 생성하는 생성자
	public Node3(int data) {
		this.data = data; link = null;//초기에는 다음 노드가 없으므로 링크를 null로 설정
	}
}
//연결 리스트를 구현하는 클래스
class LinkedList3 { //append : 주어진 데이터를 연결 리스트의 끝에 추가하는 append 메서드
	Node3 first;//첫 번째 노드를 가리키는 참조 변수
	//데이터를 연결 리스트의 끝에 추가하는 메서드
	void append(int data) {
//		if (first == null) {
//			first = new Node3(data);
//			return;
//			}
//			
//			Node3 q = first;
//			while(q.link != null ) {
//				q=q.link;
//			}
//			q.link = new Node3(data);
//		}
//		Node3 p = first,//현재 노드를 가리키는 변수 
//				q = null;//이전 노드를 가리키는 변수 
//	//추가코딩
		Node3 newNode = new Node3(data);//새로운 노드 생성
		if(first == null) {//연결 리스트가 비어있는 경우
			first = newNode;//새로운 노드를 첫 번째 노드로 설정
			return;
		} 
		
		Node3 p = first;
			while(p.link !=null) {//마지막 노드까지 이동
				p = p.link;//현재 노드를 다음 노드로 이동
			}
			p.link = newNode;//이전 노드 링크를 새 노드로 설정하여 새 노드를 연결 리스트에 추가
	}
	//연결 리스트의 모든 데이터를 출력하는 메서드
	void showList() {
		System.out.println("Linked List"); //		System.out.println()"Linked List:";
		Node3 p = first;
		
		//추가코딩
		/*GPT 답 :* */ 
		 while (p !=null) {
		 System.out.print(p.data + " ");
		 p=p.link;
		 }
		 System.out.println();
}
	// 데이터를 정렬된 순서로 연결 리스트에 삽입하는 메서드
	void insert(int data) {
		Node3 newNode = new Node3(data);// 새로운 노드 생성
		Node3 p = first;//현재 노드를 가르키는 변수 
		Node3 q = null; //이전 노드를 가리키는 변수
		//추가코딩
		if (p == null) { // 연결 리스트가 비어있는 경우
			p = newNode;// 새로운 노드를 첫 번째 노드로 설정
			q.link = q;
			return;//비어있을 경우 메서드를 종료
		}
		//연결 리스트가 비어있지 않은 경우 
		while(p !=null) {
			q = p;
			p = p.link;
		}
//		if (data < q.data) {	
////		if (data<p.data) {
//				if (q == first) {
//					newNode.link = first;
//						first=newNode;
//				}
//				return;
//			} else {
//				q = newNode;
//		}
		//q는 현재 마지막 노드를 가리키고 있음.
		q.link = newNode;//마지가 노드의 링크를 새로운 노드로 변경
	}

public class Text_배열_내부클래스 {
	static int getList(int[]data) {
		int count = 0;
		int mid = data.length/2;
		for (int i = 0; i <= mid; i++) {
			data[i] = i * 5; count++;
		}
		return count;
	}
}
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			System.out.print(" " + i + " ");
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10)
				System.out.print(" ");
			System.out.print(data[i]+ " ");
		}
	}
	static int insertList (int[] data, int count, int x) {
		int indx = 0;
		while(indx < count) {
		//for () {
			if (x < data[indx]) {
				while (indx < count) {
					int temp = data[indx];
					data[indx] = x;
					x = data[++indx];
				}
				//return ++count;
				break;
			}
			else 
				indx++;
			}
		return ++count;
	}
public static void main(String[] args) {
	int[]list = new int[10];
	int count = 0;
	System.out.println("배열로 리스트::");
	count = getList(list);
	showList(list);
	count = insertList(list, count, 3);
	//
	showList(list);
	count = insertList(list, count, 7);
	showList(list);
	
	LinkedList3 ll = new LinkedList3();
	ll.append(5);
	ll.append(10);
	ll.append(15);
	ll.append(20);
	ll.append(25);
	ll.showList();
	ll.insert(3);
	ll.showList();
	ll.insert(7);
	ll.showList();
		}
}