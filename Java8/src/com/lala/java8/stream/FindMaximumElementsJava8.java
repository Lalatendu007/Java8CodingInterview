package com.lala.java8.stream;

import java.util.Arrays;

public class FindMaximumElementsJava8 {

	public static void main(String[] args) {
		int[] arr = {12,19,20,88,00,9};
		System.out.println(findMaxElements(arr));

	}
	public static int findMaxElements(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}

}
