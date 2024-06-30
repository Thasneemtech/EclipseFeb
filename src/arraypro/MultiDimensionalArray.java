package arraypro;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		//row(i) 3   column(j) 2
		int arr[][] = new int[3][2];
		
		//initialization
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		
		arr[2][0]=50;
		arr[2][1]=60;
		
		System.out.println(arr[2][1]);//random access
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//declaration with initialization
		
		int num[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
