//Inheritance Example

class A { // Parent Class
	double bonus=5000;	
	}

class Inheritance extends A{ // Child Class
	double salary=50000;

	public static void main(String[] raj){

	Inheritance t=new Inheritance();
	System.out.println(t.bonus);
	System.out.println(t.salary);
	}
}
