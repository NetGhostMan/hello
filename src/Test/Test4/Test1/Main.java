package Test.Test4.Test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] poly = new int[101];
		int k = 0, p = 0, max = 0;
		boolean first = true;
		// 输入第一个多项式
		do {
			k = in.nextInt(); // 数组下标表示幂次
			p = in.nextInt();
			poly[k] += p; // 对应的数组元素值表示系数，幂次相等，系数相加
			if (k > max)
				max = k; // 最高幂次
		} while (k != 0); // 最后一行一定是0次幂
		// 输入第二个多项式
		do {
			k = in.nextInt();
			p = in.nextInt();
			poly[k] += p; // 幂次相等，系数相加
			if (k > max)
				max = k;
		} while (k != 0);
		// 从最高幂次开始依次降到1幂次
		for (k = max; k > 0; --k) {
			if (poly[k] > 0) {// 系数相加后，新的系数为正数
				if (first == true) // 第一项不用输出+
					first = false;
				else
					System.out.print("+");
				if (poly[k] != 1) // 系数为1不用输出
					System.out.print(poly[k]);
				System.out.print("x");
				if (k != 1) // 幂次为1不用输出
					System.out.print(k);
			} else if (poly[k] < 0) { // 系数相加后，新的系数为负数
				first = false; // 处理第一项
				if (poly[k] != -1)
					System.out.print(poly[k]);
				else
					System.out.print("-"); // 系数为-1，输出-
				System.out.print("x");
				if (k != 1)
					System.out.print(k);
			}
		}
		if (poly[0] >= 0) { // 处理0次幂，常数项是0的话，要输出0
			if (first == true) { // 只有常数项
				first = false;
				System.out.print(poly[0]);
			} else if (poly[0] != 0) // 有多项，常数项不为0，则输出，否则不输出
				System.out.print("+" + poly[0]);
		} else if (poly[0] < 0)
			System.out.print(poly[0]);
		in.close();
	}
}