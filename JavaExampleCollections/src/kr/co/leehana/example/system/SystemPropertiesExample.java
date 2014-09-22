package kr.co.leehana.example.system;

public class SystemPropertiesExample {

	public static void main(String[] args) {
		// 현재 시스템의 자바 버전을 출력합니다.
		System.out.println("Java version: "
				+ System.getProperty("java.version"));

		// 현재 시스템의 OS 버전을 확인 합니다.
		System.out.println("OS version: " + System.getProperty("os.version"));

		// 현재 유저의 홈디렉토리를 출력 합니다.
		System.out
				.println("Home directory: " + System.getProperty("user.home"));
	}
}
