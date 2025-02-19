package GuviTask5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLowerToUpper {

	public static void main(String[] args) {
		
		Stream<String> name = Stream.of("aBc","d","ef");
		List<String> upperCaseStrings= name.map(string->string.toUpperCase())//Here the toUpperCase is used to change the all strings to upperCase 
				.collect(Collectors.toList());//Here the changed upperCase strings are collected and stored as List
		System.out.println(upperCaseStrings);
		
	}

}
