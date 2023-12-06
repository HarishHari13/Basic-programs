import java.util.Scanner;

public class Incrementone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
Scanner s = new Scanner(System.in);
System.out.print("enter the elements you want in array: ");
n = s.nextInt();
int arr[]=new int[n];
System.out.print("enter all the elements: ");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt()+1;
	
}
for(int i=0;i<n;i++) 
	System.out.print(arr[i]);
	






	}

}
