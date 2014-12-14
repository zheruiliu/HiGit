package com.jerry.pattern.simplefactory;

public class TestSimpleFactory {
	public static void main(String[] args){
		SimpleFactory factory = new SimpleFactory();
		Vehicle car = factory.createVehicle(VehicleType.Car);
		car.run();
		Vehicle motor = factory.createVehicle(VehicleType.Motor);
		motor.run();
		Vehicle plane = factory.createVehicle(VehicleType.Plane);
		plane.run();
	}
}
