package que9;

import Common.Employee;

public class Demo {
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		Employee e= new Employee();
		//display this object data by passing to show method
		
		e.setId(101);
		e.setName("sam");
		 e.setSal(1000);
		 Demo.show(e);
		//add 100 bonus in salary 
		 e.setSal(1000+100);
		//display this object data by passing to show method
		Demo.show(e);
	}
	public static void show(Employee e){
		//do required changes in show method
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	}
}
