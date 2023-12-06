import java.util.Scanner;

public class Generate_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,number=2;
Scanner s = new Scanner(System.in);
System.out.print("enter the value: ");
n=s.nextInt();
for(int i=1;i<=n;i++) {
	if(number==2) {
		System.out.print(2+" ");
		number++;
		}
	else {
		Task:
		for(int j=2;j<=number/2;j++) {
			if(number%j==0) {
				number++;
				continue Task;
			}
		}
		System.out.print(number++ +" ");
	}
}
		

	}

}
