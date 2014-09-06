package kr.co.leehana.example.bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleBufferedWriterExample1 {

	public static void main(String[] args) {
		String greetings = "Hello!!!";
		String description = "I am written into a file";

		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(new File("output.txt")));
			writer.write(greetings);
			writer.newLine();
			writer.write(description);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}