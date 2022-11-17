package com.code;

record Employe(int EmpId, String name, String Dept, float salary) {
	Employe(){
	this(1652,"Balu","IT",50000f);}

public static void main(String args[]) {
	
	Employe e=new Employe(1652,"Balu","Civil",55000f);
	Employe e1=new Employe(175,"Shiva","Mech",86000f);
	
	System.out.println(e);
	System.out.println(e1);
}
}