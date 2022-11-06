// Prime or Even or Odd

import java.util.Scanner;

public class PrimeEvenOdd{  
	public static void main(String args[]){  

	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
  	int i,m=0,flag=0;    
  	m=n/2;    
	
  	if(n==0||n==1){
  		System.out.println();    
  	}else{
  		for(i=2;i<=m;i++){    
  			if(n%i==0){    
  	   			System.out.println();    
  	   			flag=1;    
  	   			break;    
  	  			}     }    
  	 if(flag==0)  { System.out.println(n+" is a Prime Number"); }
  	}//end of else
	
	
	if(n%2==0){
		System.out.println(n+" is Even Number");
	}else{
		System.out.println(n+" is Odd Number");	
	}

}  
} 
