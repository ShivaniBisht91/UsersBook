package common;

import java.util.Scanner;

public class CommonUtils {
	static Scanner sc;

	public static boolean inputCheck(String value) {
		if (value.isEmpty() || value.equals(null) || value.equals("null")) {
			return false;
		} else {
			return true;
		}
	}

	public static String takeUserStringInput() {

		sc = new Scanner(System.in);
		String value = sc.next();
		return value;
	}

	public static int takeUserNumericInput() {
		sc = new Scanner(System.in);
		int value = sc.nextInt();
		return value;
	}
}
