package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("你好");
//		System.out.println("echo:" + in.nextLine());
		int amount = in.nextInt();
		int price = in.nextInt();
		System.out.println(amount + "-" +price + "=" + (amount-price));
		in.close();

	}

}
