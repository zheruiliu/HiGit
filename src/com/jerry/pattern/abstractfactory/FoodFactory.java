package com.jerry.pattern.abstractfactory;

public class FoodFactory extends Factory {
	public Food create(FoodType ft){
		if(ft == FoodType.APPLE){
			return new Apple();
		} else{
			return new Banana();
		}
	}
	public Vehicle create(VehicleType vt){
		return null;
	}

}
