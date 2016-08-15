package hello;

import java.util.Scanner;

public class ShuZiTengZheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int shu = in.nextInt();
		in.close();
		int sim = 0;
		int byteint = 0;
		int weizhi[] = {1,2,4,8,16,32};
		for (int i = 1;shu > 0 ;i++){
		
		sim = (shu % 10)+i ;
		if(sim%2==0){
			byteint = byteint + weizhi[i-1];
		}
		shu = shu/10;
		}
		System.out.println(byteint);
	}

}
