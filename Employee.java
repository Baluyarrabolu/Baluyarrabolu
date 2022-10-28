public class Employee{
	
	int eid;
	String ename;
	String dept;
	int salary;
	
	void add_Info(int id, String n, String d, int sal){
	this.eid=id;
	this.ename=n;
	this.dept=d;
	this.salary=sal;
	}
	void display(){
	System.out.println("Employee's id: "+eid);
	System.out.println("Employee's Name: "+ename);
	System.out.println("Employee's Dept.: "+dept);
	System.out.println("Employee's Salary: "+salary);
	}
	
	public static void main(String[] args){
	Employee e1=new Employee();
	Employee e2=new Employee();
	e1.add_Info(1034,"Balu","Mech",15000);
	e2.add_Info(1652,"Sai","Civil",20000);
	e2.display();
	e1.display();	
	}

}
