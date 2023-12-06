
public class Recursive_sum_Allnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long sumofAllNumbers = sumofAllNumbers(9);
System.out.println(sumofAllNumbers);
	}
public static long sumofAllNumbers(long number) {
if (number !=0) {
	return number + sumofAllNumbers(number - 1);
}
else {
	return number;
}

	}
}

