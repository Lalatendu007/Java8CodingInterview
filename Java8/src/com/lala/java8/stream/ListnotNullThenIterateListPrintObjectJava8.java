package com.lala.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ListnotNullThenIterateListPrintObjectJava8 {
	
	public static void main(String[] args) {
		List<Notes> noteList = new ArrayList<>();
		
		noteList.add(new Notes(1, "note1",11));
		noteList.add(new Notes(2, "note2",22));
		noteList.add(new Notes(3, "note3",33));
		noteList.add(new Notes(4, "note4", 44));
		noteList.add(new Notes(5, "note5", 55));
		noteList.add(new Notes(6, "note6", 66));
		
		Optional.ofNullable(noteList)
				.orElseGet(Collections::emptyList)
				.stream().filter(Objects::nonNull)
				.map(note -> Notes::getNoteName)
	
		
	}

}

	