package eduDay7Chapter8;
//이상현 교수님이 가르쳐주신 거 
class Node3 {
	int data;
	Node3 link;
	public Node3(int data) {
		this.data = data; link = null;
	}
}
class LinkedList3 {
	Node3 first;
	
	void append(int data) {
		if (first == null) {//first : linkedList의 가장 첫 번째
			first = new Node3(data);
			return;
		}
		Node3 q = first; 
		while (q != null) {
			if (q.link == null) break;
			q = q.link;
		}
		q.link = new Node3(data);			
	}

	void insert(int data) {
		if(first == null) {
			first = new Node3(data);
			return;
		}
		Node3 q = first;
		Node3 p = null;
		while(q !=null) {
			if (data < q.data) break;
			p = q;
			q = q.link;
		}
		if (p == null) {
			p = new Node3(data);
			p.link = q;
			first = p;
		} else {
			p.link = new Node3(data);
			p = p.link;
			p.link = q;
		}
}
	void showList() {
		Node3 q = first;
		while(q !=null) {
			System.out.println(q.data + "\t");
			q = q.link;
		}
		System.out.println();

	}
}

public class Test_배열_내부클래스2 {
	
public static void main(String[] args) {
	
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

