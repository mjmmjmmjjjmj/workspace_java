package eduDay7Chapter8;

	/*
	 * 인터페이스 다형성 실습 코드
	 */
	interface Vehicle {
		public abstract void showVehicle();
	}
	class Truck implements Vehicle {
		int weight;
		public Truck(int weight) {
			this.weight=weight;
		}
		public void showVehicle() {
			System.out.println("Truck: weight="+weight);
		}
	}
	class Car implements Vehicle {
		int vehicleOccupants;
		public Car(int vehicleOccupants) {
			this.vehicleOccupants=vehicleOccupants;
		}
		public void showVehicle() {
			System.out.println("Car: vehicleOccupants="+vehicleOccupants);	
		}
	}
	class Taxi extends Car {
		int mileage;
		public Taxi(int mileage, int vehicleOccupants) {
			super(vehicleOccupants);
			this.mileage=mileage;
		}
		
		/*public Taxi(int vehicleOccupants, int mileage ) {
			super(vehicleOccupants);
			this.mileage=mileage;
		}
		public void showVehicle() {
			super.showVehicle();
			System.out.println("Taxi: mileage="+mileage);
		}
	}*/
	class MotorCycle implements Vehicle{
		int price;
		public MotorCycle(int price) {
			this.price=price;
		}
		public void showVehicle() {
			System.out.println("MotorCycle: price="+price);
		}
	}
	public class Test_인터페이스_다형성 {

		public static void displayVehicles(Vehicle [] a) {
			for (Vehicle v : a) {
				v.showVehicle();
			}
		}
	public static void main(String[] args) {
		Vehicle [] arr = new Vehicle[/*10*/5];//배열 만든 거임 객체 만든 게 아님
		//arr[5] = new Vehicle();인터페이스라 객체로 못 만들어서 오류난 거임
		arr[0] = new Truck(33);//첫 번째 배열 : 배열에서 트럭 객체 만든 거임
		arr[1] = new Car(4);
		arr[2] = new Taxi(2, 9000);
		arr[3] = new Truck(22);
		arr[4] = new MotorCycle(12000);
		displayVehicles(arr);//함수에다가 객체들의 배열을 전달함
	}
	}
