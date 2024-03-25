package chapter6;

import java.util.Random;
import java.util.Scanner;

interface MaxHeap {
	public void Insert(int x);
	public int DeleteMax();
}

class Heap implements MaxHeap {
	final int heapSize = 100;
	private int[] heap;
	private int n; // current size of MaxHeap
	private int MaxSize; // Maximum allowable size of MaxHeap

	public Heap(int sz) {
		MaxSize = sz;
		setN(0);
		heap  = new int [sz];
	}

	public void display() {
		int i ;
		System.out.println("MaxHeap:" );
		for (i = 1; i <= getN(); i++) 
			System.out.println("(" + i + ", " + heap[i] + "");
			System.out.println("\n");
	}

	@Override
	public void Insert(int x) {
		int i;
		if (getN() == MaxSize) {
			HeapFull();
		return;
		}
	setN(getN() + 1);
	for(i = getN(); i > 1;) {
		if ( i == 1) 
			break; //at root
		if (x <= heap[i/2]) 
			break;
		//move from parent to i
		heap [i] = heap[i/2];
		i /=2 ;
	}
	heap[i] = x;
	}

	@Override
	public int DeleteMax() {
		int i, j;
		if (getN() == 0) {
			HeapEmpty();
			return 0;
		}
		int max = heap[1]; 
		int k = heap[getN()];
		setN(getN() - 1);
		
		for(i = 1, j = 2; j <= getN();) {
			if (j < getN() && heap[j] < heap[j + 1]) 
				j++;
			//j points to the larger child
			if (k >= heap[j]) 
				break;
			heap[i] = heap[j];
			i = j;
			j *= 2;
		}
		heap[i] = k;
		return max;
	}

	private void HeapEmpty() {
		System.out.println("Heap Empty");
	}

	private void HeapFull() {
		System.out.println("Heap Full");
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}

public class Test_HeapSort {

	static void showData(int[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.print(d[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		int select = 0;
		Scanner stdIn = new Scanner(System.in);
		Heap heap = new Heap(20);
		final int count = 10;
		int[] x = new int[count + 1];
		int[] sorted = new int[count];

		do {
			System.out.println("Max Tree. Select: 1 insert, 2 display, 3 sort, 4 exit => ");
			select = stdIn.nextInt();
			switch (select) {
			case 1:
				int data = stdIn.nextInt();
				heap.Insert(data);
				break;
			case 2:
				heap.display();
				break;
			case 3:
				//정렬은 DeleteMax()를 n번 호출하여 출력
				int n = heap.getN();
				for (int i = 0; i < n; i++) {
					sorted[i] = heap.DeleteMax();
				}
				//sorted[] 출력
				break;

			case 4:
				return;

			}
		} while (select < 5);

		return;
	}
}
