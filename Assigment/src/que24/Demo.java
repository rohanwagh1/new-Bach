package que24;

import Common.Employee;

public class Demo {
	public static void m1(Employee e) {
		// display data here
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
	}

	public static void main(String[] args) {
		// call m1 method from here
		Employee e = new Employee();
		e.setId(1);
		e.setName("tejas");
		e.setSal(1000);
		Demo.m1(e);
	}
}
