// Bank Project

class Bank{
	int getInterest(){return 0;}	
	}

class Balu extends Bank{
	int getInterest(){return 10;}
	}
	
class Sai extends Bank{
	int getInterest(){return 12;}
	}

class Shiva extends Bank{
	int getInterest(){return 8;}
	}

class Bank_Project{
	
	public static void main(String[] args){
	
	Balu b=new Balu();
	System.out.println("Balu bank rate of Interest: "+b.getInterest());
	
	Sai s=new Sai();
	System.out.println("Sai bank rate of Interest: "+s.getInterest()); 
	
	Shiva sh=new Shiva();
	System.out.println("Shiva bank rate of Interest: "+sh.getInterest());
	
	}
}
