//Palindrome number or not

public class PalindromeNumber{
	public static void main(String[] args){
	
	int n=12321,reverse=0,r,temp=n;
	while(n>0){
		r=n%10;
		reverse=reverse*10+r;
		n=n/10;
	}
	
	if(temp==reverse)
		System.out.println("Palindrome Number");
	else
		System.out.println("Not a Palindrome Number");
	}
}
