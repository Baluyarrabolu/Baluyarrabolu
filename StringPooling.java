// String Pooling

class StringPooling{

	public static void main(String[] args){
	
	String s1="a";
	String s2="b";
	String s3="b";
	String s7="A";

	System.out.println(s1==s2); //false
	System.out.println(s2==s3); //true

	String s4=new String("a");
	String s5=new String("b");
	String s6=new String("b");

	System.out.println(s4==s5); //false
	System.out.println(s5==s6); //false
	System.out.println(s2.equals(s3)); //true
	System.out.println(s1.equalsIgnoreCase(s7)); //true
	}
}
