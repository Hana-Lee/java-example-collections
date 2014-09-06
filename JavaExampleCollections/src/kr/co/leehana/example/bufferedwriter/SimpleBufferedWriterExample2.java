package kr.co.leehana.example.bufferedwriter;

import java.io.IOException;

public class SimpleBufferedWriterExample2 {

	public static void main(String[] args) {
		Logger logger = null;
		try {
			logger = new Logger("log.txt");
			logger.log("Test 1");
			logger.log("Test 2");
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
