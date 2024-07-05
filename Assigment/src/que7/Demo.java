package que7;

import Common.Employee;

public class Demo {
	public static void main(String[] args) {
		//here create two objects of Employee class and add  data into that
		
		Employee e= new Employee(1,"Tejas",80000);
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("Shubham");
		e1.setSal(70000);
		//call show method and pass this two objects to show method
		Demo.show(e,e1);
	}
	public static void show(Employee e ,Employee e1){
		//do required changes to show method and display that data here
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSal());
	}
}
