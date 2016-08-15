package hello;
import java.util.Scanner;

public class Yuefen {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}
}

class Fraction {
	// 定义变量
	int a;// 分子
	int b;// 分母
	// 构造函数

	Fraction(int a, int b) {
		this.a = a;// 给分子赋值
		this.b = b;// 给分母赋值
	}

	// 转化为double
	double toDouble() {
		double x;// 定义一个double变量
		x = a / b;// 分子除以分母得出的结果就是double类型
		return x;// 返回double类型的变量
	}

	// 分数加法函数
	Fraction plus(Fraction r) {
		int ac = (a * r.b) + (b * r.a);// 分子等于加数的分子乘以被加数的分母加上被加数的分子乘以加数的分母
		int bc = b * r.b;// 分母等于加数的分母乘以被加数的分母
		Fraction fraction = new Fraction(ac,bc); 
		return fraction;// 因为我直接赋值给他自己了，所以返回也是this。
		// 但问题就是出在这里，断点测试到这里的时候结果是对的，但是是在输出的时候好像用结果又做了一次运算。
	}

	// 分数乘法函数
	Fraction multiply(Fraction r) {
		int ac = a * r.a;// 分子等于乘数的分子乘以被乘数的分子
		int bc = b * r.b;// 分母等于乘数的分子乘以被乘数的分母
		Fraction fraction = new Fraction(ac,bc); 
		return fraction;// 因为我直接赋值给他自己了，所以返回也是this。

	}

	// 约分输出
	void print() {
		// 如果分子分母相等直接输出1
		if (a == b) {
			System.out.println(1);
		}
		// 约分，用分子和分母的公因数（1除外）去除，在这里用2以上的数分别去除，只要除到最后分子分母的其中一个小于2
		// 就证明除完了，也就得到最简的了。反之只要大于1 就继续循环。
		else {
			int i = 2;
			while (a / i > 1 || b / i > 1) {
				if (a % i == 0 && b % i == 0) {
					a = a / i;
					b = b / i;
				} else {
					i++;
				}
			}
			System.out.println(a + "/" + b);

		}
	}
}
