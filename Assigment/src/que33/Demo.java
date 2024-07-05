package que33;

import Common.Employee;

public class Demo {
	public static void show(Employee e){
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		
	}
	public static Employee process(Employee e){
		e.setId(10);
		e.setName("tanvir");
		e.setSal(1350);
		return e;
		
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		Employee e=new Employee();
		//add data into that empty object using process method
		process(e);
		//In process (e0) data are set so we send to this method to show class as argument for displaying
		//display employee object with data in show method
		show(process(e));
	}
}

