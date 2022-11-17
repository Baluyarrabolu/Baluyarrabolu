package com.code;

record Person(String Name, String Job, double salary, int Experience ) {
	Person(){
	this("Manoj","IT",20000,2);}

	public static void main(String[] args){
		
	Person p=new Person("Manoj","IT",30000,2);
	Person p1=new Person("Vamsi","Civil Engineer",35000,5);
	Person p2=new Person("Krishna","Doctor",65000,7);
	
	System.out.println(p);
	System.out.println(p1);
	System.out.println(p2);
	}
}
