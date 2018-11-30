package javaProgramming;

class Animals{
 public void animalSound(){
	System.out.println("Default Sound");
 }
}
public class javaOverRiding extends Animals{

	   public void animalSound(){
		System.out.println("Woof");
	   }
	   public static void main(String args[]){
		   
		   Animals obj1 = new Animals();
		   obj1.animalSound();

		   javaOverRiding obj2 = new javaOverRiding();
		   obj2.animalSound();

		   Animals obj3 = new javaOverRiding();
		   obj3.animalSound();
	   }
}