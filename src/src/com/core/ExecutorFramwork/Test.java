package src.com.core.ExecutorFramwork;

public class Test {
	
	/*
	 * Based on functionality we can group thread into a single unit which is  nothing but thread group
	 * that is thread group contains a group of threads 
	 *      In addition to thread group  , Group contains sub thread group .
	 *      
	 *      The main advantage of maintaining thread in the form of thread group is we can perform
	 *      common operation very easily
	 *      
	 *      every Thread in java belongs to thread group
	 *      main thread belongs to main thread group
	 *      every thread in java is child group of system group act as root for all thread groups in java
	 *      
	 *      System group contains several system level threads like.
	 *      [ finalizer , reference handle , signal dispatcher , attach listner ]
	 *      
	 *       
	 *       ThreadGroup exteds --> Object class directly 
	 * 
	 * */

	public static void main(String[] args) {

      System.out.println(Thread.currentThread().getThreadGroup().getName());
      
	}

}
