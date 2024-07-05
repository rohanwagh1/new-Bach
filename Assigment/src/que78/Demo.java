package que78;

import java.util.ArrayList;
import java.util.Iterator;

import Common.Employee;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "sam", 10000));
		al.add(new Employee(102, "sameer", 2000));
		al.add(new Employee(103, "shyam", 30000));
		al.add(new Employee(104, "ram", 4000));
		al.add(new Employee(105, "ramesh", 15000));
		al.add(new Employee(106, "sameera", 60000));
		//create another arrayList which contains Employees whose salary is more than 5000
                   //display new list
		  ArrayList al1 = new ArrayList();
		Iterator<Employee> it=al.iterator();
		while(it.hasNext()){
		Employee e=it.next();
		if(e.getSal()>5000){
			al1.add(e.getId()+""+e.getName()+""+e.getSal());
		}
	}
		System.out.println(al1);
}}

