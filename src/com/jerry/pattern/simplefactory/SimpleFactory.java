package com.jerry.pattern.simplefactory;

public class SimpleFactory {
	public Vehicle createVehicle(VehicleType vt){
		if(vt == VehicleType.Car){
			return new Car();
		} else if(vt == VehicleType.Motor){
			return new Motor();
		} else{
			return new Plane();
		}
	}
}
