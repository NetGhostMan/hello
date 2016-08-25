package hello;

import java.util.Scanner;

import org.junit.Test;

public class Second {
	@Test
	public void piao() {
		Scanner in = new Scanner(System.in);
		System.out.println("请投币：");
		int amount = in.nextInt();
		System.out.println(amount);
		System.out.println(amount >= 10);
		in.close();
		if (amount >= 10) {
			System.out.println("******************");
			System.out.println("****java 城际铁路专线××");
			System.out.println("*  无指定座位票    *");
			System.out.println("*   票价10元       *");
			System.out.println("******************");
			System.out.println("找零：" + (amount - 10));
		}
	}
	@Test
	public void age() {
		final int MINOR = 35;
		
		System.out.println("请输入你的年龄：");
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		in.close();
		if (age < MINOR){
			System.out.println("年轻是美好的");
		}
		System.out.println("年龄决定了你的精神世界，好好珍惜吧。");
	}
	public void max() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		int max;
		if(x>y)
			max = x;
		else
			max = y;
		System.out.println(max);
	
	}
}
