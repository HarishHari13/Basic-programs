package Collections;
import java.util.ArrayList;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> alist=new ArrayList<String>();
	alist.add("steve");
	alist.add("tim");
	alist.add("lucy");
	alist.add("pat");
	alist.add("angela");
	alist.add("tom");
	System.out.println(alist);
	alist.remove("steve");
	alist.remove("angela");
	System.out.println(alist);
	alist.remove(2);
	System.out.println(alist);
	for(String str:alist)
		System.out.println(str);
	

	
	}
}

