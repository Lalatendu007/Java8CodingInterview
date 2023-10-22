package com.lala.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseStreamJava8 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList();
		names.add("aa");
		names.add("bb");
		names.add("cc");
		names.add("dd");
		
		List<String> nameList = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(nameList);
		
	}

}
