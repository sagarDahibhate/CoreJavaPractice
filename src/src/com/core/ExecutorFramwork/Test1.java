package src.com.core.ExecutorFramwork;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("run method executed");
		} catch (Exception e) {
			System.out.println("exception  " + e);
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("ThreadGroup-01");

		Thread t1 = new Thread(tg, "first Thread");
		Thread t2 = new Thread(tg, "second Thread");

		MyThread mt = new MyThread();
		//mt.start();

		ThreadGroup tg1 = new ThreadGroup( tg,"ThreadGroup - 01");
		ThreadGroup tg2 = new ThreadGroup( tg,"ThreadGroup - 02");

		ThreadGroup[] th04 = new ThreadGroup[tg.activeGroupCount()];
		tg.enumerate(th04);

		for (ThreadGroup t : th04) {
		  System.out.println("name of the thread " + t.getName());
		}
		
		ThreadGroup group=Thread.currentThread().getThreadGroup().getParent();
		System.out.println(group.getName());
		ThreadGroup [] th05=new ThreadGroup[group.activeGroupCount()];
		group.enumerate(th05);
 		
		for(ThreadGroup t:th05) {
			System.out.println("abc - abc "+t.getName());
		}
		
		
		Thread [] th06=new Thread[group.activeCount()];
		
		 group.enumerate(th06);
		 for(Thread th:th06) {
			 System.out.println(th.getName());
		 }
		
		
	}
}
