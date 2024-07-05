package que21;

import Common.Employee;

public class Demo {
	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
      Employee e = new Employee();
	Demo.m1(e);
	}
}
