package com.lala.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElementsJava8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long count = list.stream()
						 .count();
		System.out.println(count);
	}
}
