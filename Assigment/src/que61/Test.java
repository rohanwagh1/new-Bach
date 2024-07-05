package que61;

import java.util.ArrayList;

public class Test{

//create five Employee objects here
//add those objects in ArrayList
//display object data from ArrayList using for loop
	public static void main(String[] args) {
		Employee e1=new Employee(1,"sam",1000);
		Employee e2=new Employee(2,"ram",2000);
		Employee e3=new Employee(3,"jen",3000);
		Employee e4=new Employee(4,"viswa",4000);
		Employee e5=new Employee(5,"shubham",5000);
		
		ArrayList<Employee> a=new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		System.out.println(a);
		
		for(Employee x:a){
			System.out.println(x);
		}
		
	
}
}

