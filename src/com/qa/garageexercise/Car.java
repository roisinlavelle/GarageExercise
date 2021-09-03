package com.qa.garageexercise;

public class Car extends Vehicle {
	
	public boolean spareTyre;
	public String modelName;
	
	public float calcBill() {
		
		int totalBill = 0;
		String condition = modelName;
		
		if(condition == "Newest model 2021") {
			return totalBill * 40;
		}
		
		return totalBill;
	}

	public Car(int ID, String engine, int noOfWheels, boolean carDrives) {
		super(ID, engine, noOfWheels, carDrives);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param engine
	 * @param noOfWheels
	 * @param carDrives
	 * @param spareTyre
	 * @param modelName
	 */
	public Car(int ID, String engine, int noOfWheels, boolean carDrives, boolean spareTyre, String modelName) {
		super(ID, engine, noOfWheels, carDrives);
		this.ID = ID;
		this.spareTyre = spareTyre;
		this.modelName = modelName;
	}

	public int ID() {
		return ID;
	}
	
	public boolean isSpareTyre() {
		return spareTyre;
	}

	public void setSpareTyre(boolean spareTyre) {
		this.spareTyre = spareTyre;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	

}
