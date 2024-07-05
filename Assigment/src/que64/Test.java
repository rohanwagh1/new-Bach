package que64;

import java.util.ArrayList;
import java.util.Iterator;

import Common.Employee;

//63.
class Test{
	
	public static void display(ArrayList a){
		Iterator<Employee>  e=a.iterator();
		while(e.hasNext()){
		Employee emp  = e.next();
		System.out.println(emp);
		
		
		
	//do required changes to display method
	//display ArrayList data here
	}
	}
public static void main(String[] args) {
	
//create five Employee objects here
	Employee e1=new Employee(1,"sam",1000);
	Employee e2=new Employee(2,"ram",2000);
	Employee e3=new Employee(3,"jen",3000);
	Employee e4=new Employee(4,"viswa",4000);
	Employee e5=new Employee(5,"shubham",5000);
//add those objects in ArrayList
	ArrayList<Employee> a=new ArrayList<>();
	a.add(e1);
	a.add(e2);
	a.add(e3);
	a.add(e4);
	a.add(e5);
	Test.display(a);
//pass this ArrayList to display function
	
	
}

}

