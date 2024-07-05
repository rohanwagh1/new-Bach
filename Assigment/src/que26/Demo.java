package que26;

import Common.Employee;

public class Demo {
	public static void m1(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// create Employee object here with 101,sam,1000 data
		Employee e = new Employee(101, "sam", 1000);
		// call m1 method and pass employee id as parameter
		Demo.m1(101);
	}
}
