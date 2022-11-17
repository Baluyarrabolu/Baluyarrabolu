package com.code;

record Student(int age, String name, String standard){
	Student(){
	this(14,"Sai","9th");}

	public static void main(String[] args){

	Student e=new Student(14,"Sai","9th");
	Student e1=new Student(10,"Mani","6th");
	
	System.out.println(e);
	System.out.println(e1);
	}
}