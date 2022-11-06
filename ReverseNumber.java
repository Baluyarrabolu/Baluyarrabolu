// Reverse Number

public class ReverseNumber{
	public static void main(String[] args){

	int n=3456,reverse=0,r;
	while(n>0){
		r=n%10;
		reverse=reverse*10+r;
		n=n/10;	
	}System.out.println(reverse);	

	}
}
