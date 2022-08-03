package exercise2;

import exercise3.MyString;

public class Word {

	private String value;

	public Word(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return this.value;
	}
	//exercise 2
	public Word mirror() {

		String r = "";
		//your code here
		return new Word(r);
	}
	
	//exercise 4
	public Word encode(int base) {
		//your code here
		
		return new Word("?");
	}
	
	//exercise 5
	public Word decode(int base) {
		//your code here
		
		return new Word("?").mirror();
	}
}
