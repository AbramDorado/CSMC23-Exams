import java.util.Scanner;

public class Center {
	public static void execute() {
		int[] arr1 = {1, 2, 3, 4 ,5};
		int[] arr2 = {1, 1, 5, 5 ,10, 8, 7};
	
		System.out.print("Array 1: ");
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		
		System.out.print("Array 2: ");
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		if (arr1[0] < 2)
			arr1[0] = 0;
		if (arr1[1] < 2)
			arr1[1] = 0;
		if (arr1[2] < 2)
			arr1[2] = 0;
		if (arr1[3] < 2)
			arr1[3] = 0;
		if (arr1[4] < 2)
			arr1[4] = 0;
		
		if (arr1[0] > 4)
			arr1[0] = 0;
		if (arr1[1] > 4)
			arr1[1] = 0;
		if (arr1[2] > 4)
			arr1[2] = 0;
		if (arr1[3] > 4)
			arr1[3] = 0;
		if (arr1[4] > 4)
			arr1[4] = 0;
		
		if (arr2[0] < 2)
			arr2[0] = 0;
		if (arr2[1] < 2)
			arr2[1] = 0;
		if (arr2[2] < 2)
			arr2[2] = 0;
		if (arr2[3] < 2)
			arr2[3] = 0;
		if (arr2[4] < 2)
			arr2[4] = 0;
		
		if (arr2[0] > 9)
			arr2[0] = 0;
		if (arr2[1] > 9)
			arr2[1] = 0;
		if (arr2[2] > 9)
			arr2[2] = 0;
		if (arr2[3] > 9)
			arr2[3] = 0;
		if (arr2[4] > 9)
			arr2[4] = 0;
		
		//int size = arr1.length;
		
		int added = arr1[0] + arr1[1] + arr1[2] + arr1[3] + arr1[4];
		int mean = added/3;
		
		int added2 = arr2[0] + arr2[1] + arr2[2] + arr2[3] + arr2[4] + arr2[5] + arr2[6];
		int mean2 = added/7;
		
		System.out.print(mean);
		
	}
			
	
	public static void main(String[] args) {
		 execute();
	 }
	
	
}
