package mainCode;

import java.util.InputMismatchException;

import common.CommonUtils;
import utils.ArrayListUtil;
import utils.HashMapUtil;
import utils.IUser;

public class UsersList {
	public static void main(String[] args) {

		IUser ul = null;
		System.out.println(
				"What type of user structure you want to add your users: ArrayList or Hashmap. Please provide your inputs...");

		String value = CommonUtils.takeUserStringInput();

		if (CommonUtils.inputCheck(value) == true) {

			try {
				if (value.equalsIgnoreCase("hashmap")) {
					ul = new HashMapUtil();
				} else if (value.equalsIgnoreCase("arraylist")) {
					ul = new ArrayListUtil();
				} else {
					System.out.println("No such user listing exist in this planet");
				}

			} catch (NullPointerException ex) {
				System.out.println(ex);
			}
		}

		if (ul != null) {
			System.out.println("Enter the number of users you want to add in a selected list type");
			try {
				int userSize = CommonUtils.takeUserNumericInput();
				ul.addUsers(userSize);
				ul.printUsers();
			} catch (InputMismatchException ex) {
				System.out.println("please provide numeric value only");
			} catch (NullPointerException ex) {
				System.out.println("please provide some input. Null value is not acceptable");
			}

		}

	}

}
