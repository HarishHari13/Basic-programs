package assessment;

public class home2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,num;
n=5;
num=1;
for(int i=1;i<=n;i++)
{
	for(int space=1;space<=n-i;space++)
{
	System.out.print(" ");
}
	for (int j=1;j<=i;j++)
	{
		
		System.out.print(num+" ");
		num++;
	}
	System.out.println();
}
}
	}
	
