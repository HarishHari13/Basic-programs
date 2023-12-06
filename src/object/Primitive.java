package object;

public class Primitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates objects of wrapper class
Integer obj1 = Integer.valueOf(23);
Double obj2 = Double.valueOf(5.59);
Boolean obj3 = Boolean.valueOf(true);



//convert into primitive types
int var1 = obj1.intValue();
double var2 = obj2.doubleValue();
boolean var3 = obj3.booleanValue();



//print the primitive values
System.out.println("the value of print variable:" +var1);
System.out.println("the value pf double variable:" +var2);
System.out.println("the value of boolean variable:" +var3);
	}

}
