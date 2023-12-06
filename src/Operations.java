import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,n,add,subtract,multiply;
float divide;
Scanner s = new Scanner(System.in);
System.out.println("enter two numbers to perform operations: ");
System.out.println("enter the first number: ");
m = s.nextInt();
System.out.println("enter the second number: ");
n = s.nextInt();
add = m+n;
subtract = m-n;
multiply = m*n;
divide = m/n;
System.out.println("sum = " +add);
System.out.println("difference = " +subtract);
System.out.println("multiplication = " +multiply);
System.out.println("division = " +divide);

		






	}

}
