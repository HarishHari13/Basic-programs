package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list=new LinkedList<String>();
list.add("Steve");
list.add("Carl");
list.add("Raj");
list.addFirst("Negan");
list.addLast("Rick");;
list.add(2,"Glenn");
Iterator<String>iter=list.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
	
}
		
	}

}
