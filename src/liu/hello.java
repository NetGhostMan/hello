package liu;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class hello {

	private static void inRead() {
		System.out.println("hello world");
		byte[] buffer = new byte[1024];
		try {
			int len = System.in.read(buffer);
			String s = new String(buffer,0,len);
			System.out.println("读到了"+len+"个字节");
			System.out.print(s);
			System.out.println("s的长度为："+s.length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void outPut() {
		byte[] buf = new byte[10];
		for (int i = 0; i<buf.length; i++){
			buf[i] = (byte)i;
		}
		try {
			DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
			int i = 0xcafebabe;
			out.write(i);
			out.close();
			DataOutputStream in = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outPut();
		
	}

}
