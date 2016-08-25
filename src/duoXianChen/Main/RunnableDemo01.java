package duoXianChen.Main;

import duoXianChen.Runnable.MyThread;

public class RunnableDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my1 = new MyThread("线程A");
		MyThread my2 = new MyThread("线程B");
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		t1.start();
		t2.start();
		
	}

}
