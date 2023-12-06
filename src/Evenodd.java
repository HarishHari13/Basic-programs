import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s = new Scanner(System.in);
System.out.print("enter no.of elements in array: ");
n=s.nextInt();
int arr[]=new int[n];
System.out.print("enter the elements: ");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int m=0;
int p=0;
int even[]=new int[m];
int odd[]=new int[p];

for (int i=0;i<n;i++) {
	if(arr[i]%2==0)
	   even[m++]=arr[i];
	else
		odd[p++]=arr[i];
}
System.out.print("odd: ");
for(int i=0;i<p;i++) {
	if(i==p-1)
	System.out.print(odd[i]);
	else
		System.out.print(odd[i]+", ");
}
System.out.print("\neven: ");
for(int i=0;i<m;i++) {
	if(i==m-1)
		System.out.print(even[i]);
	else
		System.out.print(even[i]+", ");
}
	
	


	
	
		
}



	}


