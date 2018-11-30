package javaProgramming;

abstract class animalexample{
	public abstract void animalSound();
}
public class javaAbstract extends animalexample{
	public void animalSound(){
		System.out.println("Default sound");
	}
	
	public static void main(String[] args){
		javaAbstract obj = new javaAbstract();
		
		obj.animalSound();
	}
}

	

