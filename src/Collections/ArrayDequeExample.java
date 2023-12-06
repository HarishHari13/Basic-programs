package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String> dq = new ArrayDeque<String>();
dq.add("Glenn");
dq.add("Negan");
dq.addLast("Maggie");
dq.addFirst("Rick");
dq.add("Dary");
System.out.println("Elements in deque:"+dq);
	}

}
