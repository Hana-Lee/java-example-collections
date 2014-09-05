package kr.co.leehana.example.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriterExample {

	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");

	// jdk 7
	// private static final String LINE_SEPARATOR = System.lineSeparator();

	public static void main(String[] args) throws IOException {
		String name = "Hana Lee";
		int age = 37;
		double temp = 27.3d;
		FileWriter fw = null;

		try {
			fw = new FileWriter(new File("textfile.txt"));

			fw.write(String.format("My name is %s.", name));
			fw.write(LINE_SEPARATOR);
			fw.write(String.format("I am %d years old.", age));
			fw.write(LINE_SEPARATOR);
			fw.write(String.format("Today's temperature is %.2f.", temp));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null)
				fw.close();
		}
		
		System.out.println("Done");
	}
}
