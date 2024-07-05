package que63;

import java.util.Enumeration;
import java.util.Vector;

import Common.Employee;

//62.
class Test{
public static void main(String[] args) {
//create five Employee objects here
//add those objects in Vector
//display object data from Vector using Enumeration
	Employee e1=new Employee(1,"sam",1000);
	Employee e2=new Employee(2,"ram",2000);
	Employee e3=new Employee(3,"jen",3000);
	Employee e4=new Employee(4,"viswa",4000);
	Employee e5=new Employee(5,"shubham",5000);
	
	Vector<Employee> v=new Vector<>();
	v.add(e1);
	v.add(e2);
	v.add(e3);
	v.add(e4);
	v.add(e5);
	System.out.println(v);
	
	Enumeration<Employee> e=v.elements();
	while(e.hasMoreElements()){
		Employee a=e.nextElement();
		System.out.println(a);
	}
}
}

