package duoXianChen.Main;

import duoXianChen.Runnable.MyThread1;

public class RunnableDomo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 my = new MyThread1();
		new Thread(my,"线程1111").start();
		new Thread(my,"线程2222").start();
		new Thread(my,"线程3333").start();
	}

}
