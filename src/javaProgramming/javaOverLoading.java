package javaProgramming;

class overloading{
	void display(String name){
		System.out.println("Over loading example : "+name);
	}
	void display(String name, int age){
		System.out.println("Over loading example : "+name + ", " + age);
	}
}

public class javaOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading obj = new overloading();
		obj.display("Venky");
		obj.display("Venky", 26);

	}

}
