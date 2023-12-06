import java.util.Scanner;

public class Technumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,result;
Scanner s = new Scanner(System.in);
System.out.print("enter the input: ");
n = s.nextInt();
String str1 = String.valueOf(n);
if(str1.length()==4) {
	result = (int)Math.pow((n/100)+(n%100),2);
	if(n==result)
			System.out.print("Tech number");
else
	System.out.print("not a tech number");
}
else
	System.out.print("not a valid number");
	


		

	}

}
