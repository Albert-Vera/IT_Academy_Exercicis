package Vehicles;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {

		super(plate, brand, color);
	}
	public void addWheels(Wheel frontWheel, Wheel backWheel) throws Exception {
		wheels.add(frontWheel);
		wheels.add(backWheel);

	}
}
