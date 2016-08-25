package Test.Test2.Test1;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int bjt = in.nextInt();
		in.close();
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