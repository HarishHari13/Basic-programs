package arrays;

import java.util.Scanner;

public class sumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
float average;
Scanner s = new Scanner(System.in);
System.out.print("enter no.of elemnts: ");
n = s.nextInt();
int a[] = new int[n];
System.out.println("enter all elements: ");
for(int i=0;i<n;i++)
{
	a[i] = s.nextInt();
	sum = sum+a[i];
}
System.out.println("sum:"+sum);
average = sum/n;
System.out.println("average:"+average);

}



	}


