package GuviTask5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiftsToStudents {

	public static void main(String[] args) {

		List<String> Studentnames=Arrays.asList("Arunesh","Syed","Brammes","Ajay","Ajith","Vijay","Ram","Vishnu","Abhi","Rajesh");
		List<String> names_Startwith_A=Studentnames.stream()
				.filter(n->n.startsWith("A"))  //Here the filter is used to separate the names which starts with letter A
				.collect(Collectors.toList()); //Here the separated names are collected and stored as List
		System.out.println("Students receiving special gifts :"+names_Startwith_A);

	}

}
