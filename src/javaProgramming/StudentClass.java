package javaProgramming;

class Address {
	int streetNum;
	String city;
	String state;
	String country;
	
	Address(int stNum, String ct, String st, String con) {
		this.streetNum = stNum;
		this.city = ct;
		this.state = st;
		this.country = con;
	}
}

public class StudentClass {
	
	int rollNum;
	String studentName;
	Address studentAddr;
	StudentClass(int roll, String name, Address addr) {
		this.rollNum=roll;
	    this.studentName=name;
	    this.studentAddr = addr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ad = new Address(2470, "Atlanta", "Georgia", "USA");
		StudentClass obj = new StudentClass(24, "Venkatesh Javvaji", ad);
		
		System.out.println("Roll Number of the Student : " +obj.rollNum);
	    System.out.println("Name of the Student : " +obj.studentName);
	    System.out.println("****ADDRESS of the Student****");
	    System.out.println("Street Number of the Student : " +obj.studentAddr.streetNum);
        System.out.println("City of the Student : " +obj.studentAddr.city); 
        System.out.println("State of the Student : " +obj.studentAddr.state);
	    System.out.println("Country of the Student : " +obj.studentAddr.country);
		

	}

}
