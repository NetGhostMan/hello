package Test.Test6.Test1;

import java.util.Scanner;

import org.junit.Test;

/***************** 简介 没有效率 *************************/

public class Main {
	public static boolean isPrime(int n) {
		int i;
		if (n == 1)
			return false;
		else if (n == 2)
			return true;
		else {
			for (i = 2; i < Math.sqrt(n) + 1; i++)
				if (n % i == 0)
					return false;
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int i;
		if (isPrime(n))
			System.out.println(n + "=" + n);
		else {
			System.out.print(n + "=");
			while (!isPrime(n))
				for (i = 2; i < Math.sqrt(n) + 1; i++)
					if (isPrime(i) && n % i == 0) {
						System.out.print(i + "x");
						n /= i;
						break;
					}
			System.out.println(n);
		}
		in.close();
	}

	@Test
	public void sdf() {
		Main main = new Main();
		int a = main.getValue(2);
		System.out.println(a);
	}
	
	@Test
	public int getValue(int i) {
        int result = 0;
        switch (i) { 
           case 1: 
               result = result + i; 
           case 2: 
               result = result + i  * 2; 
           case 3: 
               result = result + i  * 3; 
       } 
       return result; 
}

}
