package javaProgramming;

class Lecturer{
	
	private String tname;
	private double tsalary;
	private String mainSubject;
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getTsalary() {
		return tsalary;
	}
	public void setTsalary(double tsalary) {
		this.tsalary = tsalary;
	}
	public String getMainSubject() {
		return mainSubject;
	}
	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
}

public class javaInterfaceExample extends Lecturer implements Mathematician {

	@Override
	public void solveMathProb() {
		System.out.println("I'm a Mathematics Lecturer");
	}
	
	public static void main(String[] args){
		javaInterfaceExample obj = new javaInterfaceExample();
		obj.setTname("Venky");
		obj.setTsalary(78000.00);
		obj.setMainSubject("English");
		
		System.out.println(obj.getTname());
		System.out.println(obj.getTsalary());
		System.out.println(obj.getMainSubject());
		obj.solveMathProb();
		System.out.println(Mathematician.mainSubject);
	}
}
