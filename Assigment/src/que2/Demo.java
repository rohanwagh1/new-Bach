package que2;

import Common.Employee;

public class Demo {
	public static void main(String[] args) {
		// here create object of Employee class and add 101,sam,1000 data into
		// thate

		Employee e = new Employee(101, "sam", 1000);
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());

		// display that data here
	}
}
