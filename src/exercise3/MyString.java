package exercise3;

public class MyString {
	public static char[] getCharCodeArray(String inputString) {
		// convert string to byte[]
		byte[] byteArray = inputString.getBytes();
		// covert to char[]
		// create array of same size
		char[] charArray = new char[byteArray.length];
		// convert each byte to char
		for (int i = 0; i < byteArray.length; i++) {
			charArray[i] = (char) byteArray[i];
		}
		return charArray;
	}

	public static String getStringOfCharCodes(char[] charArray) {
		// concatenate char codes separated by comma
		String stringOfCharCodes = "";
		for (int i = 0; i < charArray.length; i++) {
			stringOfCharCodes = stringOfCharCodes + (int) charArray[i];
			if (i != charArray.length - 1) {
				stringOfCharCodes += ":";
			}
		}
		return stringOfCharCodes;
	}

	public static char[] stringBytesToCharArray(String stringOfCharCodes) {
		// split string into an array of strings
		String[] charCodeStrings = stringOfCharCodes.split(":");
		// create an array of char of the same size
		char[] chars = new char[charCodeStrings.length];
		// store each char code into the char[] array
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) Integer.parseInt(charCodeStrings[i]);
		}
		return chars;
	}

	public static String getString(char[] chars) {
		String result = new String(chars);
		return result;
	}
}
