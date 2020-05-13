package utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import common.CommonUtils;

public class HashMapUtil implements IUser {
	Map<String, String> users;
	Scanner sc;

	@Override
	public void addUser(String value) {
		users = new HashMap<>();

		users.put("userName" + 1, value);
	}

	@Override
	public void addUsers(int userSize) {
		users = new HashMap<>();
		System.out.println("Adding Users.....");
		takeValueAndAdd(userSize);

	}

	@Override
	public void takeValueAndAdd(int userSize) {
		sc = new Scanner(System.in);
		for (int i = 1; i <= userSize; i++) {

			System.out.print("Enter your " + i + " User input: ");
			users.put("userName" + i, CommonUtils.takeUserStringInput());
		}
	}

	@Override
	public void printUsers() {

		for (Entry<String, String> val : users.entrySet()) {
			System.out.println("Key for user is " + val.getKey() + " ,its value is " + val.getValue());
		}

		/*
		 * for(String val:users.values()) {
		 * System.out.println("Key for userName key for "+i+" user is "+val); i++; }
		 */
	}

}
