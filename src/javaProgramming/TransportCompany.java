package javaProgramming;

class CarClass {
	String carName;
	int vin;
	
	CarClass(String cName, int vin){
		this.carName = cName;
		this.vin = vin;
	}
}

class DriverClass extends CarClass {
	String driverName;
	String driverId;
	
	DriverClass(String dName, String dId, String cName, int cId){
		super(cName, cId);
		this.driverName = dName;
		this.driverId = dId;
	}
}

public class TransportCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverClass obj = new DriverClass("Venky", "VXJ16111990", "Mazda", 1611);
		System.out.println(obj.driverName+" is a driver of car Id: "+obj.vin +" and his driver Id is : "+obj.driverId +". His car make model is : " +obj.carName);
	}

}
