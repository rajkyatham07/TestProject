package com.st.util;

public class Sorter {
	public int[] sort(int[] in){
		int swap = 0;
			for(int i = 0;i<in.length;i++){
				for(int j = 0;j<in.length-i-1;j++){
					if(in[j]>in[j+1]){
						swap = in[j];
						in[j] = in[j+i];
						in[j+i] = swap;
					}
				}
			}
		return in;
		
	}
}
