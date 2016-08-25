package Test.Test1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int f = in.nextInt();
		double e = 9.0/5.0;
		int c = (int)((f-32)/e);
		System.out.println(c);
		in.close();
	}
}