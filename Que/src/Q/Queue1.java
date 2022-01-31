package Q;

import java.util.Stack;

public class Queue1 {
	static class Queue{
		static Stack<Integer> s1=new Stack<Integer>();
		static Stack<Integer> s2=new Stack<Integer>();
		
		static void pushQueue(int x) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(x);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		static int  popQueue() {
			if(s1.empty())
				System.out.println("queue is empty ");
			return s1.pop();
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qu=new Queue();
		qu.pushQueue(1);
		qu.pushQueue(2);
		qu.pushQueue(3);
		qu.pushQueue(4);
		qu.pushQueue(5);
		System.out.println(qu.popQueue());
	}

}
