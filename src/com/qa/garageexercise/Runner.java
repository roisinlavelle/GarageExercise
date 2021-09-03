package com.qa.garageexercise;

public class Runner {
	
	public static void main(String[] args) {
		
		Vehicle truck1 = new Truck(1, "Petrol", 10, true, 2, "Green");
		Vehicle truck2 = new Truck(2, "Diesel", 8, true, 6, "Red");
		Vehicle car1 = new Car(3, "Petrol", 4, true, false, "Ford Focus");
		Vehicle car2 = new Car(4, "Diesel", 4, true, false, "Volkswagen Golf");
		Vehicle tractor1 = new Tractor(5, "Diesel", 4, true, false, 6);
		Vehicle tractor2 = new Tractor(6, "Diesel", 4, true, true, 4);
		
		
		
	}

}
