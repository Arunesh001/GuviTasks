package GuviTask5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringEmptyorNot {

	public static void main(String[] args) {
		
		List<String> string=Arrays.asList("abc", "","bc","efg","abcd","","jkl");
		List<String> Nonemptystring=string.stream()
				.filter(s->!s.isEmpty())      //Here list of arrays are checked and filtered with the help of isEmpty() method 
				.collect(Collectors.toList());//Here filtered Strings are collected and stored as List
		System.out.println("With Empty :"+string);
		System.out.println("Without Empty :"+Nonemptystring);

	}

}
