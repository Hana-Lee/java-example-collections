package kr.co.leehana.example.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamSimpleExample {

	public static void main(String[] args) {
		BufferedInputStream input = null;
		try {
			input = new BufferedInputStream(new FileInputStream("test.txt"));
			StringBuilder sb = new StringBuilder();
			while (input.available() > 0) {
				sb.append((char) input.read());
			}

			System.out.println("read this :");
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
