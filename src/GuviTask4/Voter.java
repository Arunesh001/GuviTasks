package GuviTask4;

public class Voter {
	int voterID;
	String name;
	int age;
	public Voter(int voterID,String name,int age) throws InvalidAgeException {
		this.voterID=voterID;
		this.name=name;
		if(age<18) {
			throw new InvalidAgeException();
		}
		this.age=age;
	}
	public void display() {
		System.out.println("VoterID :"+voterID);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);

	}
}
