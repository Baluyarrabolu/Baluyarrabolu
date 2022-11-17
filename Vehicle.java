package com.code;

record Vehicle(String VehicleName, int Model, int Seats, double cost) {
	Vehicle(){
	this("Tata",2020,4,750000);}
	
	public static void main(String[] args) {
	
	Vehicle c=new Vehicle("Tata Nexon",2020,4,750000);
	Vehicle c1=new Vehicle("Hyndai Venue",2022,4,930000);
	Vehicle c2=new Vehicle("Toyota Fortuner",2021,7,1200000);
	
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c2);
	}
}