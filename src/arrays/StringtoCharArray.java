package arrays;

import java.util.Scanner;

public class StringtoCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String str1 = s.next();
int n =str1.length();
char ch[]=str1.toCharArray();
for(int i=0;i<n-1;i+=2) {
	System.out.print(ch[i+1]+""+ch[i]);
			
}
	}

}
