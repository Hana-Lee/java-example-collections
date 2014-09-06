package kr.co.leehana.example.bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	private BufferedWriter writer;

	public Logger(String filename) throws IOException {
		this.writer = new BufferedWriter(new FileWriter(new File(filename)));
	}

	public Logger(File logFile) throws IOException {
		this.writer = new BufferedWriter(new FileWriter(logFile));
	}

	public void log(String s) throws IOException {
		String date = new Date().toString();
		this.writer.write(date + " : " + s);
		this.writer.newLine();
		this.writer.flush();
	}

	public void close() throws IOException {
		this.writer.close();
	}
}