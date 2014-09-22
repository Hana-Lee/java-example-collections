package kr.co.leehana.example.system;

import java.util.Map;

public class EnvironmentalVariablesExample {
	public static void main(String[] args) {
		Map<String, String> vars = System.getenv();

		// 모든 환경 변수를 출력합니다.
		for (String key : vars.keySet())
			System.out.println("Key: " + key + ", Value: " + vars.get(key));
	}
}
