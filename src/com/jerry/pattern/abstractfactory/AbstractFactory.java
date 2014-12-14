package com.jerry.pattern.abstractfactory;

public class AbstractFactory {
	public Factory getFactory(FactoryType factoryType){
		if(factoryType == FactoryType.VEHICLE){
			return new VehicleFactory();
		} else if(factoryType == FactoryType.FOOD){
			return new FoodFactory();
		}
		return null;
	}
}
