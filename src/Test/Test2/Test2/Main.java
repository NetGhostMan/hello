package Test.Test2.Test2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] R = new String[5];
		String[] S = new String[9];
		R[0] = " unreadable.";
		R[1] = " barely readable, occasional words distinguishable.";
		R[2] = " readable with considerable difficulty.";
		R[3] = " readable with practically no difficulty.";
		R[4] = " perfectly readable.";
		S[0] = "Faint signals, barely perceptible,";
		S[1] = "Very weak signals,";
		S[2] = "Weak signals,";
		S[3] = "Fair signals,";
		S[4] = "Fairly good signals,";
		S[5] = "Good signals,";
		S[6] = "Moderately strong signals,";
		S[7] = "Strong signals,";
		S[8] = "Extremely strong signals,";
		String rs = ""; 
		Scanner in = new Scanner(System.in);
		int nb = in.nextInt();
		in.close();
		int n = nb / 10;
		int b = nb - n*10;
		switch (n) {
		case 1:
			rs = R[0];
			break;
		case 2:
			rs = R[1];
			break;
		case 3:
			rs = R[2];
			break;
		case 4:
			rs = R[3];
			break;
		case 5:
			rs = R[4];
			break;
		}
		switch (b) {
		case 1:
			rs = S[0] + rs;
			break;
		case 2:
			rs = S[1] + rs;
			break;
		case 3:
			rs = S[2] + rs;
			break;
		case 4:
			rs = S[3] + rs;
			break;
		case 5:
			rs = S[4] + rs;
			break;
		case 6:
			rs = S[5] + rs;
			break;
		case 7:
			rs = S[6] + rs;
			break;
		case 8:
			rs = S[7] + rs;
			break;
		case 9:
			rs = S[8] + rs;
			break;
		}
		System.out.println(rs);
	}

}
