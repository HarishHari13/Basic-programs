package assessment;

import java.util.Scanner;

public class hme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner s = new Scanner(System.in);
System.out.print("enter the number = ");
n=s.nextInt();
for(int i=n;i>=1;i--)
{
	for (int j=n;j>=i;j--)
	{
		System.out.print(j +" ");
		}
	System.out.println();
}
s.close();
}

}
