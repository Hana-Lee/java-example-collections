package kr.co.leehana.example.listtoarray;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExampleWithNoneArgument {

	public static void main(String[] args) {
		runExample();
		runExample2();
	}

	private static void runExample() {
		List<String> strList = new ArrayList<String>();
		strList.add("One");
		strList.add("Two");
		strList.add("Three");

		Object[] objArray = strList.toArray();

		for (int i = 0; i < objArray.length; i++) {
			System.out.println("output : " + objArray[i].toString());
		}
	}

	private static void runExample2() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("Hana Lee", 37));
		userList.add(new User("Gildong Hong", 41));

		Object[] objArray = userList.toArray();

		for (int i = 0; i < objArray.length; i++) {
			User user = (User) objArray[i];
			System.out.println("User name : " + user.getName());
			System.out.println("User age : " + user.getAge());
		}
	}
}
