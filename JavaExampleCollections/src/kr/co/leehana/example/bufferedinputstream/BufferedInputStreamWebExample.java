package kr.co.leehana.example.bufferedinputstream;

import java.io.IOException;

public class BufferedInputStreamWebExample {

	public static void main(String[] args) {
		try {
			SimpleHttpClient client = new SimpleHttpClient("http://httpbin.org");
			String myIp = client.get("/ip");
			System.out.println(myIp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
