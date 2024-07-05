package que4;

import Common.Employee;

public class Demo {
	   public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that using constructor
		   
		  Employee e=new Employee(101,"sam",1000);
	
		  
		//display that data here
		  System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	   }
	}

