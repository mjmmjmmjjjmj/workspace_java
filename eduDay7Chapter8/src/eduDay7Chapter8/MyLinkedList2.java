package eduDay7Chapter8;

public class MyLinkedList2 {
	private Node head = null;
	private class Node {
		private String data;
		private Node link;
		
		public Node(String data) {
			//생성자는 필드가 2개이므로 heap에 필드 공간 2개를 할당
			this.data = data;this.link = null;
		}
	}
	public void add(String data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node next = head;
			while(next.link !=null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}
	public void pring() {
		
	}
	public MyLinkedList2(Node head) {
		this.head = null;
	}
}
