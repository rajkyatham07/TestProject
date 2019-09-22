package com.st.util;

public class ArrayUtil {
	public int[] reverse(int[] in) {
		int[] reverse = null;
		int j = 0;

		reverse = new int[in.length];
		for (int i = in.length - 1; i >= 0; i--) {
			reverse[j++] = in[i];
		}
			 
		return reverse;
		
	}

	public int[] reverse1(int[] inArray) {
		// TODO Auto-generated method stub
		return null;
	}

}
