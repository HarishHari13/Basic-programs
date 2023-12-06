package variable;

public class Test {
	int b=100;  //Instance variable or class variable have default value
	public static int x;   //Static variable - no need create an object to call this variable
	public void local_var() {
		int a =10;   //local variable do not have default value
		System.out.println("local a = "+ a);
		System.out.println("local b = "+ b);
		}
	void display() {
		System.out.println("diaplay b = "+b);
		}

	public static void main(String[] args) {
	Test obj = new Test();
	obj.local_var();
	obj.display();
	System.out.println(obj.b);
	System.out.println("x = " + x);
	}

}
