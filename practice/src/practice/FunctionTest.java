package practice;

import java.util.function.Function;

abstract class Geometry {
	//최상위 추상 클래스 Geometry 생성
	//추상 메서드로 면적 구하는(getArea();) 선언
	abstract double getArea();
}
//자식 클래스들 생성
//Circle (int radius), Rectangle(int width, int height), 
//Triangle(width, height)
class Circle extends Geometry {
	//Geometry class가 abstract class라서 여기서 메서드를 다 구현해줘야 함

	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Geometry {
	int w;
	int h;
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (double)(h*w);
	}
}
class Triangle extends Geometry {
	int w;
	int h;
	
	public Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (double)(h*w*0.5);
	}
}

public class FunctionTest {
	public static void main(String[] args) {
		//Function 람다 생성
		Function<Geometry, Double> func = (g) -> {
			//면적 구하기
			return g.getArea();
		};
		// 츌력
		System.out.println("원 면적: " + func.apply(new Circle(5)));
		System.out.println("사각형 면적: " + func.apply(new Rectangle(5, 10)));
		System.out.println("삼각형 면적: " + func.apply(new Triangle(8, 4)));

	}
}
