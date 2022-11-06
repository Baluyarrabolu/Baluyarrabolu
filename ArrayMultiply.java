// 2x3 Multiplication matrix

public class ArrayMultiply {
	public static void main(String arg[]) {
		int a[][]={{5,6,8},{3,4,6}};
		int b[][]={{2,2,3},{5,5,3}};
		
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++) { // For rows
			for(int j=0;j<3;j++){ // For columns
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
			}System.out.println();
		
		}
}
}

