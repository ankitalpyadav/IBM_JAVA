import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		
		for (Integer i : q) {
			System.out.println("Element in que : "+i);
		}
		System.out.println("Size of que : "+q.size());
		System.out.println("Head of Que : "+ q.peek());
		
		System.out.println("Removed element : "+q.remove());
		for (Integer i : q) {
			System.out.println("Element in que : "+i);
		}
		System.out.println("------------ Dequeue -----------");
		Deque<String> dq = new ArrayDeque<String>();
		
		dq.add("Apple");
		dq.add("Cherry");
		dq.add("Banana");
		
		for (String list : dq) {
			System.out.println(list);
		}
		
		System.out.println(dq.poll());
		

	}

}
