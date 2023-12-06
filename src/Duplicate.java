import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,index=0,flag=0;
Scanner s = new Scanner(System.in);
System.out.print("enter array size: ");
n=s.nextInt();
int arr[]=new int[n];
int temp[]=new int[n];
System.out.print("enter array elements: ");
for(int i=0;i<n;i++) {
	System.out.print("enter array elements of index "+i+": ");
	arr[i]=s.nextInt();
}
System.out.println("before removing duplicate elements are: ");
for(int i=0;i<n;i++)
	System.out.println(arr[i]);
System.out.println("after removing duplicate elements are: ");
for(int i=0;i<n;i++) {
	if(i==0)
		temp[index++]=arr[i];
	else {
		for(int j=0;j<index;j++) {
			if(arr[i]!=temp[j])
				flag=1;
			}
		if(flag==0)
			temp[index++]=arr[i];
	}
	}
for(int i=0;i<index;i++) {
	System.out.println(temp[i]);
	
	
			
			
	
}
	}
}


	

