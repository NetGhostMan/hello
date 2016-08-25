package duoXianChen.Thread;

public class MyThread1 extends Thread {
private int ticket = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			if(ticket > 0){
				System.out.println(Thread.currentThread().getName()+"卖票：ticket = "+ticket--);
			}
		}
	}
}
