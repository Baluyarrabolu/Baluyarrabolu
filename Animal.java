package com.code;

record Animal(String Name, String foodHabit, String location){
	Animal(){
	this("Rabbit", "Grass", "Forest");}
	
	public static void main(String[] args){
		
	Animal a=new Animal("Rabbit", "Grass", "Forest");
	Animal a1=new Animal("Tiger","deers or any other animals","Wild Forest");
	
	System.out.println(a1);
	System.out.println(a);
	}
}
