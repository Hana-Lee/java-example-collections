package kr.co.leehana.example.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Logger {
	private BufferedOutputStream stream;

	public Logger(String filename) throws IOException {
		this.stream = new BufferedOutputStream(new FileOutputStream(filename));
	}

	public Logger(File logFile) throws IOException {
		this.stream = new BufferedOutputStream(new FileOutputStream(logFile));
	}

	public void log(String s) throws IOException {
		String date = new Date().toString();
		String message = String.format("%s : %s", date, s);

		this.stream.write(message.getBytes());
		this.stream.write(System.getProperty("line.separator").getBytes());
		this.stream.flush();
	}

	public void close() throws IOException {
		this.stream.close();
	}
}