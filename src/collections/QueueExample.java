package collections;

import java.util.PriorityQueue;
import java.util.ArrayDeque;

public class QueueExample {
	public static void main(String[] args)
	{
		PriorityQueue<String> p1=new PriorityQueue<String>();
		p1.add("Father");
		p1.add("Mother");
		p1.add("Son");
		p1.add("Daughter");	
		System.out.println(p1);
		System.out.println("first element"+p1.peek());
		System.out.println("first element"+p1.poll());
		
		ArrayDeque<String> dp1=new ArrayDeque<String>();
		dp1.add("Father");
		dp1.add("Mother");
		dp1.add("Son");
		dp1.add("Daughter");	
		System.out.println(dp1);
		System.out.println("first element"+dp1.peek());
		System.out.println("first element"+dp1.peekFirst());
		System.out.println("first element"+dp1.peekLast());
		System.out.println("first element"+dp1.poll());
		System.out.println("first element"+dp1.pollFirst());
		System.out.println("first element"+dp1.pollLast());
		System.out.println(dp1);
		
		String[] str= {"Hello world Clean world"};
		
		
	}
}
