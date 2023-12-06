package arrays;

import java.util.Scanner;

public class File1 {
	void printarray(int n,int arr[]) {
		System.out.print("array elements: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File1 obj = new File1();
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("enter the number of elements: ");
		n = s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements one by one: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		obj.printarray(n, arr);
		
		
				
		

	}

}
