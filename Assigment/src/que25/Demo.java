package que25;

import Common.Employee;

public class Demo {
	public static void m1(Employee o){
		//display employee data here
		System.out.println(o.getId());
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		Employee e= new Employee(101,"sam",1000);
		//call m1 method by passing this Employee object
		Demo.m1(e);
	}
}





