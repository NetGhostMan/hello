package hello;

import java.util.Scanner;

import org.junit.Test;

public class First {

	@Test
	public void hello() {
		System.out.println("hello world");
		System.out.println("中文");
	}

	@Test
	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());
		in.close();
	}
	
	@Test
	public void nihao(){
		System.out.println("你好");
		Scanner in = new Scanner(System.in);
		System.out.println("echo:" + in.nextLine());
		in.close();
	}
	@Test
	public void price() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入票面");
		int amount = in.nextInt();
		System.out.println("输入金额");
		int price = in.nextInt();
		System.out.println(amount + "-" +price + "=" + (amount-price));
		in.close();
	}
	@Test
	public void high() {
		int foot;
		double inch;
		System.out.println(1.2-1.1);
		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		double china = (foot + inch/12) * 0.3048;
		System.out.println(china);
		in.close();
	}
}