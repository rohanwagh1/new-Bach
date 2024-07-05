package que77;

import java.util.ArrayList;
import java.util.Iterator;

import Common.Employee;

//77.
public class Demo {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "sam", 1000));
		al.add(new Employee(102, "sameer", 2000));
		al.add(new Employee(103, "shyam", 3000));
		al.add(new Employee(104, "ram", 4000));
		al.add(new Employee(105, "ramesh", 5000));
		al.add(new Employee(106, "sameera", 60000));
		//create another three arrayLists which contain only id ,name ,salary of these Employees.
                    //example ArrayList<Integer> ids = …
                    //example ArrayList<String> names= ...
		ArrayList<Integer> id=new ArrayList<>();
		ArrayList<String> name=new ArrayList<>();
		ArrayList<Integer> sal=new ArrayList<>();
		Iterator<Employee> it=al.iterator();
		while(it.hasNext()){
			Employee e= it.next();
			id.add(e.getId());
			name.add(e.getName());
			sal.add(e.getSal());
			
		}
		System.out.println("ids:- "+id);
		System.out.println("name:- "+name);
		System.out.println("salary:- "+sal);
	}
}


