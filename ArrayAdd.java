// 2x3 Addition matrix

public class ArrayAdd {
	public static void main(String arg[]) {
		int a[][]={{1,2,3},{4,1,3}};
		int b[][]={{1,2,3},{4,1,5}};
		
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++) { // For rows
			for(int j=0;j<3;j++){ // For columns
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
	}
}
