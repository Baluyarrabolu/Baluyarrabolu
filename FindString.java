import java.io.*;

class FindString{
	static void stringFinder(String s) {
		try {
		FileReader fr=new FileReader("/home/student/Desktop/Java Programs/Example.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();

		if(line.indexOf("Balu")!=-1) {
			System.out.println("Balu is availble");
		}else { System.out.println("Balu Not availble"); }
		}catch (IOException e) {
		e.printStackTrace(); }
	}
	
	public static void main(String args[]) {
	stringFinder("Balu");	
	}
}

