//Exception Handling Example

import java.util.*;
import java.io.*;

class ExceptionTest {

	public static void main(String args[]) {

	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter First number: ");
	String n1=br.readLine();

	System.out.print("Enter 2nd number: ");
	String n2=br.readLine();

	int a=Integer.parseInt(n1);
	int b=Integer.parseInt(n2);

	Division d=new Division();
	double res=d.divide(a,b);
	System.out.println("Result: "+res);
	}catch(NumberFormatException nfe){System.out.println("Pass No's only");}

	catch(ArithmeticException ae){System.out.println(ae);}

	catch(IOException ioe){System.out.println("reading failed");}
	}
	
}

	class Division {
	public double divide(int a, int b)throws ArithmeticException {

	if(b==0) {
	throw new ArithmeticException("Don't pass 2nd as zero"); }
	return a/b;}}
