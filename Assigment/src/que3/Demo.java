package que3;

import java.util.Set;

import Common.Employee;

public class Demo {
	public static void main(String[] args) {
		// here create object of Employee class and add 101,sam,1000 data into
		// that using setter method
		Employee e = new Employee();
		e.setId(101);
		e.setName("sam");
		e.setSal(10000);
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
		// display that data here
	}
}
