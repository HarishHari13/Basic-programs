import java.util.Scanner;

public class Mixed_series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("enter the number to generate the series: ");
int n = s.nextInt();
int fact,number=1;
for(int i=0;i<n;i++) {
	fact=1;
	if(i%2==0)
		System.out.println(i+" ");
	else {
		for(int j=1;j<=number;j++) {
			fact=fact*j;
			
		}
		System.out.print(fact+" ");
		number++;
		
	}
		
}

s.close();
	}

}
