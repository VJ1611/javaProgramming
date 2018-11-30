package javaProgramming;

class Teacher {
	   String designation = "Teacher";
	   String college = "Beginnersbook";
	   void does(){
		System.out.println("Teaching");
	   }
}

public class javaInheritence extends Teacher {
	String mainSubject = "Maths";
	   public static void main(String args[]){
		  javaInheritence obj = new javaInheritence();
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.mainSubject);
	      obj.does();
	   }
}

