package que31;

import Common.Employee;

public class Demo {
	public static Object m1(){
		//create Employee object here and return
		//don�t change m1 method prototype i.e return type or access specifier
		Employee e=new Employee(1,"raj",1000);
	      return e;
		}
	
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//there are 3 ways to catching object  use 1 ways 
		Employee a=(Employee)m1();
		//display returned employee data here
		System.out.println(a.getId()+" "+a.getName()+" "+a.getSal());
	}
}