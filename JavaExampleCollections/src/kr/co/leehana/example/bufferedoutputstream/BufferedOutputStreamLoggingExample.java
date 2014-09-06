package kr.co.leehana.example.bufferedoutputstream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedOutputStreamLoggingExample {

	public static void main(String[] args) {
		Logger logger = null;
		try {
			logger = new Logger("out.log");
			logger.log("Log message 1");
			logger.log("Log message 2");
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (logger != null) {
				try {
					logger.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
