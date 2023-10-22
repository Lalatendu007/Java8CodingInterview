package com.lala.java8.stream;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOneJava8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream()
			.map(s -> s + "")
			.filter(s -> s.startsWith("1"))
			.forEach(System.out::println);
	}

}
