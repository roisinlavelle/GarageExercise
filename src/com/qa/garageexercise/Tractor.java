package com.qa.garageexercise;

public class Tractor extends Vehicle {
	
	public boolean trailerIncluded;
	public int noOfMirrors;
	
	public float calcBill() {
		
		int totalBill = 0;
		totalBill += (noOfMirrors*5);
		return totalBill;
	}

	public Tractor(int ID, String engine, int noOfWheels, boolean carDrives) {
		super(ID, engine, noOfWheels, carDrives);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param engine
	 * @param noOfWheels
	 * @param carDrives
	 * @param trailerIncluded
	 * @param noOfMirrors
	 */
	public Tractor(int ID, String engine, int noOfWheels, boolean carDrives, boolean trailerIncluded, int noOfMirrors) {
		super(ID, engine, noOfWheels, carDrives);
		this.ID = ID;
		this.trailerIncluded = trailerIncluded;
		this.noOfMirrors = noOfMirrors;
	}
	
	public int ID() {
		return ID;
	}

	public boolean isTrailerIncluded() {
		return trailerIncluded;
	}

	public void setTrailerIncluded(boolean trailerIncluded) {
		this.trailerIncluded = trailerIncluded;
	}

	public int getNoOfMirrors() {
		return noOfMirrors;
	}

	public void setNoOfMirrors(int noOfMirrors) {
		this.noOfMirrors = noOfMirrors;
	}

	
	
}
