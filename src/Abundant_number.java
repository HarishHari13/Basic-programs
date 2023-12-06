import java.util.Scanner;

public class Abundant_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("Enter the number:");
int n = s.nextInt();
int sum = 0;
for(int i=1;i<n;i++) {
	if(n%i==0)
		sum+=i;
	
}
if(sum>n)
	System.out.println("abundant number");
else
	System.out.println("not abundant number");
	}

}
