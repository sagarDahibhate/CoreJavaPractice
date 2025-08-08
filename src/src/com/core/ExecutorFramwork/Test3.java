package src.com.core.ExecutorFramwork;

import java.util.concurrent.locks.ReentrantLock;

public class Test3 {
	
	public static void main(String[] args) {
		ReentrantLock rl=new ReentrantLock();
		
		
		rl.lock();
		rl.lock();
		System.out.println(rl.isLocked());   //true 
		System.out.println(rl.isHeldByCurrentThread()); //true
		System.out.println(rl.getHoldCount());  //0
		System.out.println();System.out.println();
		
		rl.unlock();
		System.out.println(rl.isLocked());   //tue
		System.out.println(rl.isHeldByCurrentThread()); //true
		System.out.println(rl.getHoldCount());  //1
		System.out.println();System.out.println();
		
		
		rl.unlock();
		System.out.println(rl.isLocked());  //false
		System.out.println(rl.isHeldByCurrentThread());  //false
		System.out.println(rl.getHoldCount());  //0
		System.out.println();System.out.println();
		
	
	}

}
