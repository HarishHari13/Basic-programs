package object;

public class Wrapper_class1 {

	public static void main(String[] args) {
		//create primitive types
		int var1 = 5;
				double var2 = 5.65;
				boolean var3 = true;
				
				
				//convert into wrapper objects
				Integer obj1 = Integer.valueOf(var1);
				Double obj2 = Double.valueOf(var2);
				Boolean obj3 = Boolean.valueOf(var3);
				
				
				//checks if obj are objects of corresponding wrapper class
				if(obj1 instanceof Integer) {
					System.out.print("an object of integer is created");
				}
				
				if (obj2 instanceof Double) {
					System.out.print("an object of doublr is created");
				}
				if (obj3 instanceof Boolean) {
					System.out.print("an object boolean is created");
				}

	}

}
