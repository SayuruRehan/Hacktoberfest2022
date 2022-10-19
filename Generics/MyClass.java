package Boundary;

public class MyClass <T, Y>{
	T x1;
	Y x2;
	
	public void myMethod(T y1, Y y2) {
		this.x1 = y1;
		this.x2 = y2;
	}
	
	public void display() {
		System.out.println(x1);
		System.out.println(x2);
	}
}
