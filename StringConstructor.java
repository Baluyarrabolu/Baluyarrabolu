class StringConstructor{

	public static void main(String args[]){
	
	String s1="abc"; // String literal
	System.out.println(s1); //abc

	String s2=" ";
	System.out.println(s2); //empty space

	String s3=new String();
	System.out.println(s3); //empty space

	String s4=new String("Hi");
	System.out.println(s4); //Hi

	String s5=new String(s1);
	System.out.println(s5); //abc

	String s6=s1;
	System.out.println(s6); //abc

	char ch[]={'a','b','c','d','e','f'};
	System.out.println(ch); //abcdef

	String s7=new String(ch);
	System.out.println(s7); //abcdef

	String s8=new String(ch, 1,3);
	System.out.println(s8); //bcd

	byte b[]={46,67,24,65};
	System.out.println(b); //Address

	String s9=new String(b);
	System.out.println(s9); //ASCII code

	String s10=null;
	System.out.println(s10); //null

	String s11=new String(s10);
	System.out.println(s11); // Compile Time Error

	String s12=new String(s10);
	System.out.println(s12); // JVM Throws NullPointerException
	}
}
