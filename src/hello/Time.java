package hello;

import java.util.Scanner;

//Test2
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int bjt = in.nextInt();
		int utc = 0;
		
		if(bjt <= 2359){
			if ((bjt -800) >= 0 ){
			utc = bjt -800;
			}else{
				utc = bjt + 2400 - 800;
			}
		}
		System.out.println(utc);
	}

}
