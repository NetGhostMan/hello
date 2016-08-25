package duoXianChen.Main;

import duoXianChen.Thread.MyThread;

public class ThreadDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("线程A");
		MyThread mt2 = new MyThread("线程B");
		mt1.start();
		mt2.start();
		
	}

}
