package arrays;

import java.util.Scanner;

public class TicektVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] ticketNumbers=new int[n];
for(int i=0;i<n;i++) {
	ticketNumbers[i]=s.nextInt();
	}
int k=s.nextInt();
for(int i=0;i<n;i++) {
	if(ticketNumbers[i]%k==0) {
		System.out.print("1 ");
	}
	else {
		System.out.print("0 ");
	}
}
s.close();
	}

}
