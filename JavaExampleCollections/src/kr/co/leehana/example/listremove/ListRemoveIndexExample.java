package kr.co.leehana.example.listremove;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveIndexExample {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		strList.add("three");

		for (String str : strList)
			System.out.println(str);

		strList.remove(1); // two 제거
		System.out.println("## String 리스트에서 1번째 인덱스의 object 를 제거 한 뒤 ###");

		for (String str : strList)
			System.out.println(str);
		
		System.out.println();

		List<User> userList = new ArrayList<User>();
		userList.add(new User("Tom", "Hawk"));
		userList.add(new User("홍", "길동"));
		userList.add(new User("Michael", "Jordan"));

		for (User user : userList)
			System.out.println(user);

		userList.remove(0);

		System.out.println("### User 리스트로부터 0번째 인덱스의 object 를 제거 한 뒤 ###");
		for (User user : userList)
			System.out.println(user);
	}
}
