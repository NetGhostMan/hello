package hello;

import java.util.Scanner;

//Test 1
public class WenDu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		double e = 9.0/5.0;
		int c = (int)((f-32)/e);
		System.out.println(c);
		in.close();
	}

}
