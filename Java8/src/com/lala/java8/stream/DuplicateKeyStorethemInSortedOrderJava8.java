package com.lala.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateKeyStorethemInSortedOrderJava8 {
	
	public static void main(String[] args) {
		List<Notes> noteList = new ArrayList<>();
		
		noteList.add(new Notes(1, "note1",11));
		noteList.add(new Notes(2, "note2",22));
		noteList.add(new Notes(3, "note3",33));
		noteList.add(new Notes(4, "note4", 44));
		noteList.add(new Notes(5, "note5", 55));
		noteList.add(new Notes(6, "note6", 66));
		
		Map<String,Integer> notesRecords = noteList.stream()
				.sorted(Comparator.comparingLong(Notes::getTagId).reversed())
				.collect(Collectors.toMap(Notes::getNoteName, Notes::getTagId,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		
		System.out.println("Notes : "+notesRecords);
	}

}
class Notes{
	private int id;
	private String noteName;
	private int tagId;
	
	public Notes(int id, String noteName, int tagId) {
		super();
		this.id = id;
		this.noteName = noteName;
		this.tagId = tagId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoteName() {
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public int getTagId() {
		return tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	
	
}
