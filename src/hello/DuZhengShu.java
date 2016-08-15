package hello;

import java.util.Scanner;

public class DuZhengShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] read = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
		String str = "";
		String str1="";
		Scanner in = new Scanner(System.in);
		
		int nub = in.nextInt();
		
			if (nub < 0){
				str = "fu";
				nub = -nub;
			}
			
			do{
			int a = nub%10;
			str1= " " + read[a] + str1;
			nub = nub/10;
			}while(nub > 0);
			String str2 = str + str1;
		System.out.println(str2.trim());
		in.close();
	}

}
