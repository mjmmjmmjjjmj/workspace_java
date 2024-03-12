package eduDay15Chapter13.study;


class Bag<Object> {
	private Object thing;
	
	public Bag(Object thing) {
		this.thing = thing;
	}
//	public Bag() {
//	// TODO Auto-generated constructor stub
//	}
	public Object getThing() {
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}
	
	void showType() {
		System.out.println("Object의 타입은" + thing.getClass().getName());
	}
}

class Book {}
class PencilCase {}
class Notebook {}

public class BagTest2 {
	
	public static void main(String[] args) {
		
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());
		
		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2;//둘 다 object 타입인데 안에 들어있는 값은 다르기 때문에 실제로는 오류남
//		
//		Bag<Book> bag = new Bag<>();
//		bag.setThing(new Book());
//		bag.showType();		
		
	}
}
