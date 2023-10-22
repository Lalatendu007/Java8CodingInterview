package com.lala.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicateJava8 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		boolean contains = containsDuplicate(nums);
		System.out.println(contains);
		
	}
	public static boolean containsDuplicate(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		
		if(set.size() == list.size()) {
			return false;
		}else {
			return true;
		}
		
	} 

}
