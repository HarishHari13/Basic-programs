import java.util.Scanner;

public class Employee_dollar {
	
	private int emp_id;
	private String emp_name;
	private double emp_salary;

	public int getemp_id() {
		return emp_id;
	}
public String getemp_name() {
	return emp_name;
}
public double getemp_salary() {
	return emp_salary;
}
public void setemp_id(int newValue) {
	emp_id=newValue;
}
public void setemp_name(String newValue) {
	emp_name=newValue;
}
public void setemp_salary(double newValue) {
	emp_salary=newValue;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("id: ");
int id=s.nextInt();
System.out.print("name: ");
String name=s.next();
System.out.print("salary: ");
double salary=s.nextDouble();
Employee_dollar obj = new Employee_dollar();
obj.setemp_id(id);
obj.setemp_name(name);
obj.setemp_salary(salary);
System.out.println("employee details: ");
System.out.print("id "+obj.getemp_id());
System.out.print("name "+obj.getemp_id());
System.out.print("salary "+obj.getemp_salary());
	}

}
