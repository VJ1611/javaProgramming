package javaProgramming;

class Parentclass
{
   Parentclass(){
	System.out.println("Constructor of parent class");
   }
}
class javaSuperKeyword extends Parentclass
{
	javaSuperKeyword(){
	/* Compile implicitly adds super() here as the
	 *  first statement of this constructor.
	 */
	System.out.println("Constructor of child class");
   }
	javaSuperKeyword(int num){
	/* Even though it is a parameterized constructor.
	 * The compiler still adds the no-arg super() here
	 */
	System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
   public static void main(String args[]){
	/* Creating object using default constructor. This 
	 * will invoke child class constructor, which will 
	 * invoke parent class constructor
	 */
	   javaSuperKeyword obj= new javaSuperKeyword();
	//Calling sub class method 
	obj.display();
	/* Creating second object using arg constructor
	 * it will invoke arg constructor of child class which will
	 * invoke no-arg constructor of parent class automatically 
	 */
	javaSuperKeyword obj2= new javaSuperKeyword(10);
	obj2.display();
   }
}