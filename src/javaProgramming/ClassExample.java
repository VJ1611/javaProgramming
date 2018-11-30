package javaProgramming;

public class ClassExample {
	String myName;
	int age;
	//Constructor
	ClassExample(String name, int age){
		this.myName = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// creating objects/instance of the class
		ClassExample obj1 = new ClassExample("Venky", 26);
		ClassExample obj2 = new ClassExample("Anu", 24);
		
		System.out.println(obj1.myName+ ", " + obj1.age);
		System.out.println(obj2.myName+ ", " + obj2.age);
	}

}
