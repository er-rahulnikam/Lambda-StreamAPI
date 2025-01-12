package com.example.demo2;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) {
		
		Stream<String> letterStream = Stream.of("a","b","e","r");
		
		Integer[] numbers = new Integer[] {23,4,5,7,43,75,55};
		Stream<Integer> numberStream = Arrays.stream(numbers);
		
		List<String> list = Arrays.asList("apple","orange","mango","car","bat","home");
		Stream<String> listStream = list.stream();
		
		listStream
			.map(item -> item.toUpperCase())
			.filter(item -> item.startsWith("A"))
			.sorted()
			.forEach(System.out::println);
			
	}
}
