package com.jerry.pattern.abstractfactory;

public class TestAbstractFactory {
	public static void main(String[] args){
		AbstractFactory af = new AbstractFactory();
		
		Factory vehicleFactory = af.getFactory(FactoryType.VEHICLE);
		Vehicle car = vehicleFactory.create(VehicleType.CAR);
		Vehicle plane = vehicleFactory.create(VehicleType.PLANE);
		car.run();
		plane.run();
		
		Factory foodFactory = af.getFactory(FactoryType.FOOD);
		Food apple = foodFactory.create(FoodType.APPLE);
		Food banana = foodFactory.create(FoodType.BANANA);
		apple.energy();
		banana.energy();
	}
}
