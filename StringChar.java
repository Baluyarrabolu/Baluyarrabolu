// Print each Character in a Word

class StringChar{
	static void str(String s){
		for(int i=0;i<s.length();i++)
			System.out.print(s.charAt(i)+"\t");
		System.out.println();	
	}

	public static void main(String[] args){
	
	String st="Anudip";
	str(st);
	
	System.out.println(st.indexOf("d")); //3
	System.out.println(st.lastIndexOf("n")); //1
	System.out.println(st.indexOf("b")); //-1
	System.out.println(st.charAt(2)); // u
	}
}
