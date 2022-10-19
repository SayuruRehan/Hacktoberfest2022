package Boundary;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass<Integer, String> ob1 = new MyClass<>();	//can have multiple datatypes
		
		ob1.myMethod(100, "Hi");
		ob1.display();
		
	}

}
