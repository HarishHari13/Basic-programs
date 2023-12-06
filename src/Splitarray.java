import java.util.Scanner;

public class Splitarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,p=4;
Scanner s = new Scanner(System.in);
System.out.print("enter no.of elements you want in array: ");
n=s.nextInt();
int arr[]=new int[n];
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();	
}
for(int i=1;i<p;i++) {
	System.out.print(arr[i]);	
}
for(int i=p;i<n;i++) {
	System.out.print(arr[i]);
	
}




		
		



	}

}
