package looping;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int m =0;
		int a;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = s.nextInt();
		while(n>0) {
			a=n%10;
			a++;
			m=m*10+a;
			n=n/10;
		}
n=m;m=0;
			
			while(n>0)
			{
				a=n%10;
			
				m=m*10+a;
				n=n/10;
			}
			System.out.println(m);
			
			
		}
}
			
		
				

	


