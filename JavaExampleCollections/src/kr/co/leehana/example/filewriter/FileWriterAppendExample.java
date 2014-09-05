package kr.co.leehana.example.filewriter;

import java.io.File;

public class FileWriterAppendExample {

	public static void main(String[] args) {
		Logger log1 = new Logger("file1.log");

		File logFile = new File("file2.log");
		Logger log2 = new Logger(logFile);

		log1.log("This is written in the first file");
		log2.log("This is written in the second file");

		log1.log("This is appended to the first file");
		log2.log("This is appended to the second file");
	}
}
