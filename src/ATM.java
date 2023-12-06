import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int balance=100000,withdraw,deposit;
Scanner s = new Scanner(System.in);
while(true) {
	System.out.println("welcome to ATM");
	System.out.println("select 1 for withdraw");
	System.out.println("select 2 for deposit");
	System.out.println("select 3 for check balance");
	System.out.println("select 4 for exit");
	System.out.println("choose");
	int choice = s.nextInt();
	switch(choice) {
	case 1:
		System.out.println("enter money to be withdrawn");
		withdraw = s.nextInt();
		if(balance>=withdraw) {
			balance = balance - withdraw;
			System.out.println("collect money");
			System.out.println("Your balance is: "+balance);

		}
		else
		{
			System.out.println("insufficient bal");
		}
		break;
	case 2:
		System.out.println("enter money to be deposited");
		deposit = s.nextInt();
		balance = balance + deposit;
		System.out.println("deposited");
		break;
	case 3:
		System.out.print("balance: "+balance);
		break;
	case 4:
		System.out.println("Completed");
		System.exit(0);
				
		}
	
}
	}

}
