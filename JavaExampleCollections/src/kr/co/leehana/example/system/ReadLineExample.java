package kr.co.leehana.example.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineExample {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// 표준 입력 스트림으로부터 라인을 읽습니다.
		String inputLine = reader.readLine();

		StringBuilder builder = new StringBuilder(inputLine);
		builder.reverse(); // 입력된 라인을 역으로 정렬

		System.out.println("Input string : " + inputLine);
		System.out.println("Reversed string : " + builder.toString());
		System.err.println("Reversed string : " + builder.toString());

		reader.close(); // 열려 있는 스트림 닫기
	}
}
