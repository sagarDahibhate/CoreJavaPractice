package src.com.core.ExecutorFramwork;

/*
 * Lock -->  
 *    the problem with traditional synchronized keyword is 
 *    1)   we are not having any flexiblity to try for a lock without waiting
 *    2)    there is no way to specify max waiting time for a thread to get lock . so that thread will wait until getting the lock . which may creats performance problem which may cause deadline
 *    3) if a thread releases the lock then which thread will get lock we are not having any control on this .
 *    4) there is no api to list out all waiting threads for a lock
 *    5)  the synchronized keyword compulsury we have to use at method or with in  method and its not possible to use accross multiple methods .
 *    6) to overcome above issues  we can use  [ java.util.concurrent.lock Interface]
 *    7) it provides several enhancement to the progamer to provide more control on concurrency
 *    
 *      methods -
 *      void lock()   ,  boolean tryLock()  , void lockInterruptability()  , void unLock()
 *    
 * */






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



/*
 * Reentrant Lock -->  
 *                  Means a thread can aquire same lock multiple times without any issue internally reentrant lock increment threads  personal count
 *                  whenever we call lock method decrement count value , whenever we call unlock method & lock will be released wheever count reaches zero 
 *                   
 * */
 