package hello;

import java.util.Scanner;

public class ShuShuHe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int cut = 0;
		int he = 0;
		for (int i = 2; cut < m; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				cut++;
				if (cut >= n) {
					he = he + i;
				}
			}
		}
		System.out.println(he);
	}

}
