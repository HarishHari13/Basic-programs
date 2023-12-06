package arrays;

import java.util.Scanner;

public class SwapElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
int n =s.nextInt();
int[] arr  = new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
for(int i=0;i<n-1;i+=2) {
	int temp=arr[i];
	arr[i]=arr[i+1];
	arr[i+1]=temp;
}
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
}
s.close();
	}

}
