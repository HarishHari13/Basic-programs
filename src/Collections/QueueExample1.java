package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> q = new LinkedList<String>();
q.add("Rick");
q.add("Maggie");
q.add("Glenn");
q.add("Megan");
q.add("Dary");
System.out.println("Elements in queue:"+q);
System.out.println("Removed element: "+q.remove());
System.out.println("Head: "+q.element());
System.out.println("poll():"+q.poll());
System.out.println("peek():"+q.peek());
System.out.println("elements in queue:"+q);
	}

}
