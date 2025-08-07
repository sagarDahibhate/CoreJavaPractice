package src.com.core.ExecutorFramwork;

class Display {
	public synchronized void wish(String name) {
		System.out.println("Good morning " + name);
	}
}

class MyThread1 extends Thread {
	Display d;
	String name;

	public MyThread1(String name, Display d) {
		this.name = name;
		this.d = d;
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				d.wish(name);
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			System.out.println("getting issue while running thread ");
		}
	}
}

public class Test2 {
	public static void main(String[] args) {
        MyThread1 t1=new MyThread1("sagar", new Display());
        MyThread1 t2=new MyThread1("mansi", new Display());
        t1.start();
        t2.start();
        
	}

}
