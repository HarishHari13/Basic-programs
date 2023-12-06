import java.util.Scanner;

public class FirstIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int upper=0,lower=0,digit=0,special=0,space=0,vowel=0,consonant=0;
Scanner s = new Scanner(System.in);
String str1=s.nextLine();
char ch[]=str1.toCharArray();
for(int i=0;i<ch.length;i++) {
	if(Character.isLetter(ch[i])) {
		if(Character.isUpperCase(ch[i])&&upper==0) {
			System.out.println("capital letter: "+(i+1));
			upper++;
		}
		if(Character.isLowerCase(ch[i])&&lower==0){
			System.out.println("small letter: "+(i+1));
			lower++;
		}
	}
	else if(Character.isDigit(ch[i])) {
		digit++;
	}
	else if(ch[i]==' ' && space==0) {
		System.out.println("space: "+ch[i+1]);
		
	}
	if(vowel==0 || consonant==0) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||
				ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
			System.out.println("vowel: "+(i+1));
			vowel++;
			}
		else if(consonant==0) {
			System.out.println("consonant: "+(i+1));
			consonant++;
		}
	}
	else if(ch[i]!=' '&&special==0 && !Character.isLetter(ch[i])) {
		System.out.println("special: "+(i+1));
		special++;
	}
}
	}

}
