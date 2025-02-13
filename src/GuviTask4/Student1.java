package GuviTask4;

public class Student1 {
	int roll_no;
	String name;
	int age;
	String course;
	String special_char = "!@#$%^&*()_-/+0123456789 ";
	
	//This constructor is used to  initialize parameters
	public Student1(int roll_no,String name,int age,String course) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	//This method is used to check the name whether it contains special characters and numbers or not 
	public void NameException(String name1) throws NameNotValidException {
		for (int i = 0;i<name1.length();i++) {
			for(int j=0;j<special_char.length();j++) {
				if(name.charAt(i) == special_char.charAt(j)) {
					 throw new NameNotValidException(name1);
				}
			}
		}
		this.name=name1;
	}
	
	//This method is used to check the age within range 0f 15 to 21
	public void AgeException(int age) throws AgeNotWithinRangeException {
		if(age<15 || age>21) {
			throw new AgeNotWithinRangeException(age);
		}
		this.age=age;
	}
	//This method is used to display the output
	public void display(int roll_no,String name,int age,String course) {
		System.out.println("-------------------------------------");
		System.out.println("Roll no :" +roll_no);
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
		System.out.println("Course :" +course);
	}
}