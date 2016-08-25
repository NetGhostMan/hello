package liu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Liu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket(InetAddress.getByName("www.baidu.com"),8080);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line;
			line = in.readLine();
			System.out.println(line);
			in.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
