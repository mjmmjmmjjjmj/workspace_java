package chapter11;

/*
 Graph Representation
 Adjacency Lists + BFS + DFS
*/

import java.util.Scanner;

class ListNode {
	int data; // 노드의 데이터
	ListNode link; // 다음 노드를 가리키는 링크

	public ListNode(int data) { // 생성자
		this.data = data;
		link = null;
	}
}

class List { // 연결 리스트 클래스
	ListNode first; // 리스트의 첫 번째 노드를 가리키는 포인터

	public List() {// 생성자
		first = null;
	}

	// 노드를 리스트에 삽입하는 메서드
	void Insert(int k) {// 같은 값을 체크하지 않아 중복 입력됨
		// 구현할 부분
		ListNode temp = new ListNode(k); // 삽입할 새로운 노드 생성
		if (first == null) {
			first = temp;// 리스트가 비어 있으면 첫 번째 노드로 설정
			return;
		}
		ListNode p = first, q = null;
		while (p != null) {
			// 리스트의 끝까지 이동
		}
	}

	// 노드를 리스트에서 삭제하는 메서드
	void Delete(int k) {
		// 구현할 부분
	}
}

class ListIterator {

	private List list;
	private ListNode current;

	// 생성자
	public ListIterator(List l) {
		list = l;
		current = list.first;
	}

//	첫 번째 노드의 데이터 변환
	int First() {
		if (current != null)
			return current.data;
		else
			return 0;
	}

	int Next() { // 다음 노드의 데이터 반환
		int data = current.data;
		current = current.link;
		return data;
	}

	boolean NotNull() { // 현재 노드가 null인지 여부 반환
		if (current != null)
			return true;
		else
			return false;
	}

	boolean NextNotNull() {// 다음 노드가 null인지 여부 반환
		if (current.link != null)
			return true;
		else
			return false;
	}

}

class QueueNode { // 큐 노드 클래스
	int data;
	QueueNode link;

	QueueNode(int data, QueueNode link) {// 생성자
		this.data = data;
		this.link = link;
	}
}

class Queue {
	private QueueNode front, rear;// 큐의 전단(front)과 후단(rear)

	void QueueEmpty() {// 큐를 비우는 메서드
		front = rear = null;
	}

	public Queue() {// 생성자
		QueueEmpty();
	}

	boolean IsEmpty() { //큐가 비어있는지 여부 반환
		if (front == null)
			return true;
		else
			return false;
	}

	void Insert(int y) { //큐에 요소 삽입
		// 구현할 부분
	}

	int Delete() { //큐에서 요소 삭제
		return 0;
		// 구현할 부분
	}
}

class StackNode {
	ListNode data;
	StackNode link;

	StackNode(ListNode data, StackNode link) {//생성자
		this.data = data;
		this.link = link;
	}
}

class Stack {
	private StackNode top; //스택의 꼭대기

	void StackEmpty() {//스택을 비우는 메서드
		top = null; 
	}

	public Stack() {
		StackEmpty(); //생성자
	}

	boolean IsEmpty() {//스택이 비어있는지 여부 확인
		if (top == null)
			return true;
		else
			return false;
	}

	void Insert(ListNode y) {//스택에 요소 삽입
		// 구현할 부분

	}

	ListNode Delete() //스택에서 요소 삭제하고 해당 요소의 데이터 반환
	// delete the top node in stack and return its data
	{
		return null;
		// 구현할 부분
	}
}

class Graph {
	private List[] HeadNodes; //그래프의 인접 리스트
	int n; //그래프의 정점 개수
	boolean[] visited; //방문 여부를 나타내는 배열

	public Graph(int vertices) {//생성자
		int[][] a = new int[3][];
		for (int i = 0; i < a.length; i++)
			a[i] = new int[4];
		// int [][]data = new int[3][4] 와 위에 있는 식은 동일함
		n = vertices;
		HeadNodes = new List[n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			HeadNodes[i] = new List();
			visited[i] = false;
		}

	}

	void displayAdjacencyLists() {
		for (int i = 0; i < n; i++) {
			System.out.print("\n" + i + "[] ");
			ListNode p = HeadNodes[i].first; // first를 왜 사용했는지 이해해야함
			while (p != null) {
				System.out.print("-> " + p.data);
			}
			// 구현할 부분
		}
	}

	void InsertVertex(int start, int end) { // (0,1) 전달 시
		if (start < 0 || start >= n || end < 0 || end >= n) {
			System.out.println("the start node number is out of bound.");
			return;
		}
		HeadNodes[start].Insert(end);
		HeadNodes[end].Insert(start);
		// 구현할 부분
	}

	void BFS(int v) {
		boolean[] visited = new boolean[n]; // visited is declared as a Boolean
		for (int i = 0; i < n; i++)
			visited[i] = false; // initially, no vertices have been visited
		// 구현할 부분
//		_BFS(v);
//		queue를 사용하여 구현
	}

	void ShowList(List l) {
		ListIterator li = new ListIterator(l);
		// 구현할 부분
	}

	// Driver
	void DFS(int v) {
		for (int i = 0; i < n; i++)
			visited[i] = false; // initially, no vertices have been visited

		// _DFS(v); // start search at vertex 0
		// NonRecursive DFS
		_NonRecursiveDFS(v);

	}

	// Workhorse
	void _DFS(int v)
	// visit all previously unvisited vertices that are reachable from vertex v
	{
		visited[v] = true;
		System.out.println(v + ", ");
		ListIterator li = new ListIterator(HeadNodes[v]);
		if (!li.NotNull())
			return;
		int w = li.First();
		while (true) {
			if (!visited[w])
				_DFS(w);
			if (li.NotNull())
				w = li.Next();
			else
				return;
		}
	}

	// Workhorse 2
	void _NonRecursiveDFS(int v)
	// visit all previously unvisited vertices that are reachable from vertex v
	{
		// 구현할 부분

	}
}

public class Chap11_test_그래프DFS_BFS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 10, n, startEdge = -1, endEdge = -1;
		// select : menu 선택하는 변수
		// n : 노드 개수
		// startEdge :
		// end Edge :
		int startBFSNode = 0; // the start node to BFS

		System.out.println("vertex 숫자 입력: ");

		n = sc.nextInt();

		Graph g = new Graph(n);

		while (select != '0') {
			System.out.println("\n명령 선택 1: edge 추가, 2: Adjacency Lists 출력, 3: BFS, 4: DFS, 5: 종료 => ");
			select = sc.nextInt();
			switch (select) {
			case 1:
//				System.out.println("edge 추가: from vertext: ");
//				startEdge = sc.nextInt();
//				System.out.println("to vertex: ");
//				endEdge = sc.nextInt();
//				if (startEdge < 0 || startEdge >= n || endEdge < 0 || endEdge >= n) {
//					System.out.println("the input node is out of bound.");
//					break;
//				}
//				// get smallest start node.
//				if (startEdge < startBFSNode)
//					startBFSNode = startEdge;
//				if (endEdge < startBFSNode)
//					startBFSNode = endEdge;
//				g.InsertVertex(startEdge, endEdge);
				int[][] inputData = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 }, { 2, 4 }, { 3, 4 }, { 3, 5 }, { 4, 5 } };
				for (int i = 0; i < inputData.length; i++)
					g.InsertVertex(inputData[i][0], inputData[i][1]);
				break;
			case 2:
				// display
				g.displayAdjacencyLists();
				break;

			case 3:
				System.out.println("Start BFS from node: " + startBFSNode);
				g.BFS(startBFSNode);
				break;
			case 4:
				System.out.println("Start DFS from node: " + startBFSNode);
				g.DFS(startBFSNode); // 0번으로 시작
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("WRONG INPUT  " + "\n" + "Re-Enter");
				break;
			}
		}

		return;
	}
}
