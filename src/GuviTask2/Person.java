package GuviTask2;

public class Person {
	
	String name;
	int age;
	//Initializing default name and age using constructor 
	public Person() {
		System.out.println("This is default name and age : ");
	    name = "";
	    age = 18;
	}
	//Initializing person name and age using constructor 
	public Person(String name,int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("This is actual name and age : "); 
	}
	//Initializing display object
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.display();
		Person obj1 = new Person("Arunesh",23);
		obj1.display();
	}

}
