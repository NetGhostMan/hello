package duoXianChen.Main;

import duoXianChen.Thread.MyThread1;

public class ThreadDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mt1 = new MyThread1();
		MyThread1 mt2 = new MyThread1();
		MyThread1 mt3 = new MyThread1();
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
