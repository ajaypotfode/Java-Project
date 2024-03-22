package com.jspiders.cardekho.entities;

public class Car {
	private int id;
	private String carName;
	private String brand;
	private String fuelType;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car[id=" + id + ", carName=" + carName+",brand=" + brand+ ",fuelType="+fuelType +",price="+price+"]";
	}
	public Car(int id, String carName,String brand, String fuelType, double price) {
		this.id=id;
		this.carName=carName;
	     this.brand=brand;
	     this.fuelType=fuelType; 
	     this.price=price;
		
	}
	
	
	
}
