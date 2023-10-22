package com.lala.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IMP_PrintCountOfEachCharacterJava8 {
	public static void main(String[] args) {
		findCountOfChars("string data to count each character");
	}

	private static void findCountOfChars(String s) {
			Map<String,Long> mapCount = Arrays.stream(s.split(" "))
				  .map(String::toLowerCase)
				  .collect(Collectors.groupingBy(str->str,LinkedHashMap::new,Collectors.counting()));
			
			System.out.println(mapCount);
	}

}
