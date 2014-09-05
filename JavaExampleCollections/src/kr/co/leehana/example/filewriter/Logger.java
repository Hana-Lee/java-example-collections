package kr.co.leehana.example.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	private static final String LINE_SEPARATOR = System
			.getProperty("line.separator");
	private File logFile;

	public Logger() {
	}

	public Logger(String fileName) {
		this.logFile = new File(fileName);
	}

	public Logger(File logFile) {
		this.logFile = logFile;
	}

	public void log(String str) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(this.logFile, true);
			String date = new Date().toString();
			fw.write(date + " : " + str);
			fw.write(LINE_SEPARATOR);
		} catch (IOException e) {
			System.err.println("Couldn't log this : " + str);
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
