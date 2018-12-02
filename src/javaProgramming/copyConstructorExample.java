package javaProgramming;


class copyConstructorExample{  
	   String web; 
	   copyConstructorExample(String w){  
		web = w;
	   }  

	   /* This is the Copy Constructor, it 
	    * copies the values of one object
	    * to the another object (the object
	    * that invokes this constructor)
	    */
	   copyConstructorExample(copyConstructorExample je){  
		web = je.web; 
	   }  
	   void disp(){
		System.out.println("Website: "+web);
	   }  

	   public static void main(String args[]){  
		   copyConstructorExample obj1 = new copyConstructorExample("BeginnersBook");  
			
		/* Passing the object as an argument to the constructor
		 * This will invoke the copy constructor
		 */
		   copyConstructorExample obj2 = new copyConstructorExample(obj1);  
		obj1.disp();  
		obj2.disp();  
	   }  
	}


	
	
	
	
