package hello;

import java.util.Scanner;

public class High {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
