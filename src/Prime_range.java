import java.util.Scanner;

public class Prime_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("enter the minimum value: ");
int min = s.nextInt();
System.out.print("enter the maximum value: ");
int max = s.nextInt();
System.out.print("prime numbers are: ");
for (int n=min;n<=max;n++) {
	int count = 0;
	for(int i=2;i<=n/2;i++) {
	if(n%1 == 0) {
		count++;
		break;
	}
}
	if(count==0 && n!=1)
		System.out.print(n+" ");
	}
s.close();
	}}
