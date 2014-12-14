package com.jerry.pattern.abstractfactory;

public abstract class Factory {
	public abstract Vehicle create(VehicleType v);
	public abstract Food create(FoodType f);
}
