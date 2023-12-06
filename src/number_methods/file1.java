package number_methods;

public class file1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//converting integer object into float/double object
Integer x = 10;
Float f = x.floatValue();
System.out.println(x.floatValue());
System.out.println("f = "+f);

//converting primitive data type into objects
String str = "10";
Integer y = Integer.parseInt(str);
Double d = y.doubleValue();
System.out.println("y = "+y);
System.out.println("d = "+d);
System.out.println(d.toString());


Integer num1 = 1;
Integer num2 = 1;
System.out.println(num1.compareTo(num2));
System.out.println(num1.equals(num2));

String a ="hello";
String b = "hello";
	if(a.equals(b));
	System.out.println("both strings are equal");
	
	if(a.compareTo(b)==0)
		System.out.println("both strings are equal");
	
	
	double f1 = 20.5;
	System.out.println("abs = " +Math.abs(4-7));
	System.out.println("abs = " +Math.ceil(f1));
	System.out.println("round = " +Math.round(f1));
	System.out.println("floor = " +Math.floor(f1));
	
	
	System.out.println("minimum value = " +Math.min(12, 24));
	
	System.out.println("maximum value = " +Math.max(12, 24));
	
	System.out.println(Math.pow(12,24));
	
	System.out.println("escape sequence = \r");
	
	System.out.println("escape sequence = \n");
	
	System.out.println("this is \'java\' program");
	
	
	
	//character methods
	System.out.println(Character.isLetter(10));
	System.out.println(Character.isDigit('1'));
	System.out.println(Character.toUpperCase('a'));
	System.out.println(Character.toLowerCase('B'));
	
	
	
	//string methods
	String str2 = "Welcome";      //ascii - A - 65       W - 87
	String str3 = "welcome";      //        a - 97       w - 119
	System.out.println(str2.charAt(5));
	System.out.println(str2.compareTo(str3));        // 87 - 119     = -32
	System.out.println(str2.compareToIgnoreCase(str3));
	
	
	System.out.println(str2.concat(str3));
	System.out.println(str2.length());
	System.out.println(str2.substring(4));
	System.out.println(str2.substring(2,7));
	System.out.println(str2.replace('e','a'));
	
	
	
	




		}
}
