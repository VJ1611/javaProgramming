package javaProgramming;

class encapsulation{
	private String myName;
	private int age;
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class javaEncapsulation {
	public static void main(String[] args) {
		// creating objects/instance of the class
		encapsulation obj1 = new encapsulation();
		obj1.setAge(26);
		obj1.setMyName("Venky");
		
		System.out.println(obj1.getMyName()+ ", " + obj1.getAge());
	}

}