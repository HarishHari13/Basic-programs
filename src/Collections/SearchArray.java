package Collections;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("enter no of elements you want in array: ");
 int n=s.nextInt();
int arr[]=new int[n];
System.out.print("enter the elements: ");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
	System.out.print("enter the element you want to find: ");
	
}
	}

}
