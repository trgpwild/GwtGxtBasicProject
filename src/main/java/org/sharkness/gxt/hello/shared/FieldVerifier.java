package org.sharkness.gxt.hello.shared;


public class FieldVerifier {
	
	public static boolean isValidName(String name) {
		if (name == null) {
			return false;
		}
		return name.length() > 3;
	}

	public static boolean isValidNumber(String input) {
		try {
			if(input.equals("")) {
				return true;
			}
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
