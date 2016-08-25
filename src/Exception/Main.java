package Exception;
import java.util.Scanner;

import Exception.cloceException;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int ids = in.nextInt();
		in.close();
		testException test = new testException(); 
		try{
			test.k(ids);
			System.out.println("hello");
		} catch (cloceException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("这里是主函数接住了k的异常");
		}
		
	}

}
