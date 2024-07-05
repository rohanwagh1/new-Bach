package que72;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Common.Employee;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(102, "ram", 2000));
		al.add(new Employee(103, "shyam", 3000));
		al.add(new Employee(101, "sam", 10000));
		al.add(new Employee(104, "sameer", 40000));
		//sort list in descending order of salary using sort method and Comparator
		Collections.sort(al, new SalComp() );
		System.out.println(al);
	}
}

class SalComp implements Comparator<Employee>{   //it is used our Comparator method
	@Override
	public int compare(Employee n, Employee o) {
		if(n.getSal()>o.getSal())
			return -1;
		if(n.getSal()<o.getSal())
			return 1;
		
		return 0;
	}
}

