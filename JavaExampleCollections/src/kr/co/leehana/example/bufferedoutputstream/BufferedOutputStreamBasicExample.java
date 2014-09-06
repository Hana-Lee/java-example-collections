package kr.co.leehana.example.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamBasicExample {

	public static void main(String[] args) {
		BufferedOutputStream stream = null;
		try {
			stream = new BufferedOutputStream(new FileOutputStream("out.txt"));
			stream.write("Hello, World!".getBytes());
			stream.write(System.getProperty("line.separator").getBytes());
			stream.write("I am writting into a file using BufferedOutputStream"
					.getBytes());
			stream.write(System.getProperty("line.separator").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
