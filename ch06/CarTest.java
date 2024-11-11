package ch06;

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("gray", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}

	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		return String.format("%-8s | %-8s | %d", color, gearType, door);
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("damas", "manual", 5);
		
		System.out.println("Car1 : " + c1);
		System.out.println("Car2 : " + c2);		
	}
}
