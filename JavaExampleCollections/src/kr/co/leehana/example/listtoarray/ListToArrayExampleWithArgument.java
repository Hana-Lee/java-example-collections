package kr.co.leehana.example.listtoarray;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExampleWithArgument {

	public static void main(String[] args) {
		runExample();
		runExample2();
	}

	private static void runExample() {
		List<String> strList = new ArrayList<String>();
		strList.add("One");
		strList.add("Two");
		strList.add("Three");

		String[] strArray = strList.toArray(new String[strList.size()]);

		for (int i = 0; i < strArray.length; i++) {
			System.out.println("output : " + strArray[i]);
		}
	}

	private static void runExample2() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Hana Lee", 37));
		userList.add(new User("Gildong Hong", 41));

		User[] userArray = userList.toArray(new User[userList.size()]);

		for (int i = 0; i < userArray.length; i++) {
			System.out.println("User name : " + userArray[i].getName());
			System.out.println("User age : " + userArray[i].getAge());
		}
	}
}
