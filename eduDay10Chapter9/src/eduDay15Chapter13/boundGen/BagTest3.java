package eduDay15Chapter13.boundGen;


class Bag<T extends Solid> {
	private T thing;
	
	public Bag(T thing) {
		this.thing = thing;
	}
//	public Bag() {
//	// TODO Auto-generated constructor stub
//	}
	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("T의 타입은" + thing.getClass().getName());
	}
}

class Solid {}
class Liquid {}

class Book extends Solid{}
class PencilCase extends Solid {}
class Notebook extends Solid {}

class Water extends Liquid {}
class Coffe extends Liquid {}

public class BagTest3{
	
	public static void main(String[] args) {
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		//Bag<Water> bag4 = new Bag<>(new Water());//오류발생
		//Bag<Coffee> bag5 = new Bag<>(new Coffee());//오류발생
		
//		Bag<Book> bag = new Bag<>();
//		bag.setThing(new Book());
//		bag.showType();		
		
	}
}

