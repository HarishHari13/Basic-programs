import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n =s.nextInt();
int count=0;
for(int i=2;i<=n/2;i++) {
	if(n%1 == 0) {
		count++;
		System.out.println(n+ " is not a prime number");
		break;
	}
}
if(count==0 && n!=1)
	System.out.println(n+ " is a prime number");
s.close();

	}

}
