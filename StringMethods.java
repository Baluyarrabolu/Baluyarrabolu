// String Methods

class StringMethods{
	
	public static void main(String[] args){
	
	String s1="Balu Yarrabolu";
	String s2="Balu";
	String s3="balu";

	System.out.println(s1.equals(s2)); //false
	System.out.println(s3.equalsIgnoreCase(s2)); //true
	
	System.out.println(s1.indexOf("a")); //1
	
	System.out.println(s2.substring(2)); //lu
	System.out.println(s1.substring(1,4)); //alu
	
	System.out.println(s1.concat(s2)); //adding s1 and s2
	System.out.println(s1.contains("Y")); //true

	System.out.println(s1.startsWith("B")); //true
	System.out.println(s2.endsWith("u")); //true

	String s4=s3.replace('u','l');
	System.out.println(s4); //ball
	
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());

	}
}
