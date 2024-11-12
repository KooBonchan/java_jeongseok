package ch07;

class Car{
	String color;
	int door;
	void drive() {
		System.out.println("Drive");
	}
	void stop() {
		System.out.println("Stop");
	}
	
	static void instanceTest(Object object) {
		if(object instanceof Ambulance) {
			System.out.println("\tAmbeed");
		}
		else if(object instanceof FireEngine) {
			System.out.println("\tFired Engine");
		}
		
		if(object instanceof Car) {
			System.out.println("\tCarred");
		}
		if(object instanceof Object) {
			System.out.println("\tObjected");
		}
	}
	void instanceTest() {
		instanceTest(this);
	}
}

class Ambulance extends Car{
	
	@Override
	void drive() {
		siren();
		for(int i = 0; i < 3; i++) {
			super.drive();
		}
	}

	void siren() {
		System.out.println("Siren");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		Ambulance ambulance = new Ambulance();
		
		fireEngine.water();
		car = fireEngine;
		car.drive();
		System.out.println(car.getClass().getName());
		car.instanceTest();
		
		car = ambulance;
		car.drive();
		System.out.println(car.getClass().getName());
		car.instanceTest();
		System.out.println("null");
		Car.instanceTest(null);
	}
}
