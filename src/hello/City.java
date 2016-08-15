package hello;
import java.util.ArrayList;
import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		ArrayList<String> Citys = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String city = in.next();
		while (!city.equals("###")) {
//			if (city.equals("Huzhou")) {
//				Citys.add("Suzhou");
//			} else {

				Citys.add(city);
//			}
			city = in.next();
		}
		int[][] lichengh = new int[Citys.size()][Citys.size()];
		for (int i = 0; i < Citys.size(); i++) {
			for (int j = 0; j < Citys.size(); j++) {
				lichengh[i][j] = in.nextInt();
			}
		}
		System.out.println(lichengh[Citys.indexOf(in.next())][Citys.indexOf(in.next())]);

	}
}
