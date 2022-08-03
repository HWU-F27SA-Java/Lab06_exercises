package exercise5;

import java.util.Arrays;

public class IntArray {

	private int[] tab;

	public IntArray(int n) {
		tab = new int[n];
	}

	/**
	 * Get the value of tab
	 *
	 * @return the value of tab
	 */
	public int getItemAt(int i) {
		//your code here
		return -1;
	}

	/**
	 * Set the value of tab
	 *
	 * @param tab new value of tab
	 */
	public void setItemAt(int i, int v) {
		//your code here
	}

	public int getMax() {
		//your code here
		return -1;
	}

	public int getMin() {
		//your code here
		return -1;
	}

	public void sort() {
		//your code here
	}

	@Override
	public String toString() {
		String s = "{";
		for (int i = 0; i < tab.length; i++) {
			s += tab[i] ;
			if(i < tab.length-1) {
				s += ", ";
			}
		}
		s+="}";
		return s;
	}

	public int length() {
		return tab.length;
	}

	public void pushItem(int v) {
		//your code here

	}

	public int pullItem() {
		//your code here
		return -1;
	}

}
