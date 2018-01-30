package PolymorphismDemo;

public class PolymorphismDemo {

	public static void main(String args[]) {

		PolymorphismDemo obj = new PolymorphismDemo();
		obj.add(45, 50);
		obj.add(45, 50, 60);
		obj.add(45.20, 50);
		obj.add(55, 30.90);

	}

	public void add(int a, int b) {
		int c = a + b;

		System.out.println("Sum of numbers is " + c);
	}

	public void add(int a, int b, int c) {
		int d = a + b + c;

		System.out.println("Sum of numbers is " + d);
	}

	public void add(double a, int b) {
		double c = a + b;

		System.out.println("Sum of numbers is " + c);
	}

	public void add(int a, double b) {
		double c = a + b;

		System.out.println("Sum of numbers is " + c);
	}
}
