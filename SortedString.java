import java.util.Arrays;

class SortedString {

	public static void main(String[] raj){

	String[] a= {"Balu","Shiva","Krishna","Sai","Giri"};
	String temp;
	System.out.println("Before Sorting: "+Arrays.toString(a));

	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
		if(a[i].compareTo(a[j])>0) {
			temp=a[i];//SWAPPING
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}System.out.println("After Sorting: "+Arrays.toString(a));
	
	}
}
