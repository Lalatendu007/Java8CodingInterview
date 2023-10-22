package com.lala.java8.stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumberJava8 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 29, 28, 32);
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
