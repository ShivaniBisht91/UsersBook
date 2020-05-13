package utils;

import java.util.ArrayList;
import java.util.List;
import common.CommonUtils;

public class ArrayListUtil implements IUser {
	List<String> users;

	@Override
	public void addUser(String value) {
		users = new ArrayList<>();
		users.add(value);

	}

	@Override
	public void addUsers(int userSize) {
		users = new ArrayList<>();
		System.out.println("Adding Users.....");
		takeValueAndAdd(userSize);

	}

	@Override
	public void takeValueAndAdd(int userSize) {

		for (int i = 1; i <= userSize; i++) {
			System.out.print("Enter your " + i + " User input: ");
			String value = CommonUtils.takeUserStringInput();
			users.add(value);
		}
	}

	@Override
	public void printUsers() {
		System.out.println("Printing users.....");
		for (String val : users) {
			System.out.println("Value of users are: " + val);
		}

	}

}
