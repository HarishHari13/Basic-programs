package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("TECH MAHINDRA");
		list.add(2,"ZOHO");
		list.set(1,"IMARTICUS");
		//Collections.sort(list);
	list.forEach(System.out::println);
		//for(String str:list)
			//System.out.println(str);
		list.remove(2);
		System.out.println(list.indexOf("IMARTICUS"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("HELLO"));
		for(String str:list)
			System.out.println(str);
		list.clear();
		System.out.println(list);
		
		

	}

}
