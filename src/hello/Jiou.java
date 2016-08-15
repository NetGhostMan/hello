package hello;

import java.util.Scanner;

public class Jiou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int read;
		int cutJ = 0;
		int cutO = 0;
		Scanner in = new Scanner(System.in);
		
		while ((read = in.nextInt()) != -1) {
			if(read % 2 == 0){
				cutO ++;
			}else{
				cutJ ++;
			}
			
		}
		in.close();
		System.out.println(cutJ +" "+ cutO);
	}

}
