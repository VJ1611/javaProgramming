package javaProgramming;

class SimpleStaticExample
{
    
	static int num;
	static String mystr;
	// This is a static block
	static{
		System.out.println("Static Block 1");
	    num = 97;
	    mystr = "Static keyword in Java";
	}
	static{
	      System.out.println("Static Block 2");
	      num = 98;
	      mystr = "Block2";
	  }
	// This is a static method
    static void myMethod()
    {
        System.out.println("myMethod");
    }
 
    public static void main(String[] args)
    {
          /* You can see that we are calling this
           * method without creating any object. 
           */
           myMethod();
           System.out.println("Value of num: "+num);
           System.out.println("Value of mystr: "+mystr);
    }
}