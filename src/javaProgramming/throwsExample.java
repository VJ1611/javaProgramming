package javaProgramming;

import java.io.*;

class throwex {
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if (num == 2)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}

public class throwsExample {
	public static void main(String args[]) {
		try {
			throwex obj = new throwex();
			obj.myMethod(1);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
