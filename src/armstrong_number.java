import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("enter the number:"
		+ "");
int n=s.nextInt();
int sum=0,r,temp=n;
while(n>0) {
	r=n%10;
	sum=(int)(sum+Math.pow(r, 3));
	n=n/10;
}
if(temp==sum)
	System.out.println("armstrong number");
else
	System.out.println("not a armstrong number");
s.close();



	}

}
