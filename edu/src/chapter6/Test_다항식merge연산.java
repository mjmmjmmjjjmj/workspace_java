package chapter6;

class Polynomial implements Comparable<Polynomial>{
    double coef;           // 계수
    int    exp;            // 지수
	
    
    public Polynomial (double coef, int exp) {
    	this.coef = coef;
    	this.exp = exp;
    }
    @Override
	public int compareTo(Polynomial o) {
		// TODO Auto-generated method stub
		if(this.coef > o.coef)
			return 1;
		else if(this.coef < o.coef)
			return -1;
		else if (this.exp > o.exp)
    		return 0;
		else
			return -1;
	}


}
public class Test_다항식merge연산 {

	static void merge(Polynomial[] a, int lefta, int righta, int leftb, int rightb ) {
		Polynomial temp[] = new Polynomial[14];
		int ix = 0;
		int p = lefta;
		int q = leftb;
		while(p <= righta && q <= rightb) {
			if(a[p].exp < a[q].exp) {
				temp[ix++].exp = a[p++].exp;
				temp[ix++].coef = a[p++].exp;
			}
			else if (a[p].exp > a[q].exp) { 
				temp[ix++].exp = a[q++].exp;
				temp[ix++].coef = a[q++].coef;
				}
			
			else {
				temp[ix++] = a[p++]; 
				temp[ix++]= a[q++];
			}
		}
		while (p > righta && q <= rightb) {
			if(a[p].exp > a[q].exp) {
				temp[ix++].exp = a[p++].exp;
				temp[ix++].coef = a[p++].exp;
			}
		}
		for(int i = lefta, j = 0; i<=rightb; i++, j++) {
			a[i] = temp[j];
			
		}
		
	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void MergeSort(Polynomial[] a, int left, int right) {
		int mid = (left+right)/2;
		if (left == right) return;
		MergeSort(a, left, mid);
		MergeSort(a, mid+1, right);
		merge(a, left, mid, mid+1, right);
		return;
	}

	public static void main(String[] args) {
		Polynomial[] x = {
		         new Polynomial(1.5, 3),
		         new Polynomial(2.5, 7),
		         new Polynomial(3.3, 2),
		         new Polynomial(4.0, 1),
		         new Polynomial(2.2, 0),
		         new Polynomial(3.1, 4),
		         new Polynomial(3.8, 5),
		     };
		Polynomial[] y = {
		         new Polynomial(1.5, 1),
		         new Polynomial(2.5, 2),
		         new Polynomial(3.3, 3),
		         new Polynomial(4.0, 0),
		         new Polynomial(2.2, 4),
		         new Polynomial(3.1, 5),
		         new Polynomial(3.8, 6),
		     };
		int nx = x.length;


//		ShowPolynomial(x);
//		ShowPolynomial(y);
		MergeSort(x, 0, x.length - 1); // 배열 x를 퀵정렬
		MergeSort(y, 0, y.length - 1); // 배열 x를 퀵정렬
//		ShowPolynomial(x);
//		ShowPolynomial(y);
		Polynomial[] z = new Polynomial[20];
		AddPolynomial(x,y,z);//다항식 덧셈 z = x + y
//		ShowPolynomial(z);
//		ShowPolynomial(y);
//		MultiplyPolynomial(x,y,z);//다항식 곱셈 z = x * y
//		ShowPolynomial(y);
//		int result = EvaluatePolynomial(z, 10);//다항식 값 계산 함수 z(10) 값 계산한다 
//		System.out.println(" result = " + result );
	}
//
//	private static int EvaluatePolynomial(Polynomial[] z, int i) {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	}
//
//	private static void MultiplyPolynomial(Polynomial[] x, Polynomial[] y, Polynomial[] z) {
//		// TODO Auto-generated method stub
//		
//	}

	private static void AddPolynomial(Polynomial[] x, Polynomial[] y, Polynomial[] z) {
		// TODO Auto-generated method stub
		for(int i = 0; i< z.length; i++) {
			z[i] = new Polynomial(0, i);
		
			if (i < x.length) {
				z[i].exp += x[i].exp;
				z[i].coef += x[i].coef;
			}
			if(i < y.length) {
				z[i].exp += y[i].exp;
				z[i].coef += y[i].coef;
			}
		}
		System.out.println("Add : ");
		for(int i = 0; i<z.length; i++) {
			if (z[i].coef != 0) {
				System.out.println(z[i].coef + "x" + z[i].exp);
			}
		}
		
	}
}
//
//	private static void ShowPolynomial(Polynomial[] x) {
//		// TODO Auto-generated method stub
//		
//	}
//}
