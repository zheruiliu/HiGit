package com.jerry.pattern.abstractfactory;

public class VehicleFactory extends Factory{
	public Vehicle create(VehicleType vt){
		if(vt == VehicleType.CAR){
			return new Car();
		} else if(vt == VehicleType.MOTOR){
			return new Motor();
		} else{
			return new Plane();
		}
	}
	
	public Food create(FoodType ft){
		return null;
	}

}
