// Inheritance Example

class A { // Parent Class
	int a=75;
	void m1(){System.out.println("This is A Method");}	
	}

class B extends A{ // Child Class
	int b=100;
	void m(){System.out.println("This is B method");}
	}

class C{
	public static void main(String[] args){
	
	B b=new B(); // child class object
	System.out.println(b.a);
	b.m1();
	System.out.println(b.b); 
	b.m();
	
	}
}
