package com.lala.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindMaxElementJava8 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
		int max = list.stream()
			.max(Integer::compare)
			.get();
		System.out.println(max);
	}

}
