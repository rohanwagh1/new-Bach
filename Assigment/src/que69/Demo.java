package que69;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;






public class Demo {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(102, "ram", 2000));
		al.add(new Employee(103, "shyam", 3000));
		al.add(new Employee(101, "sam", 10000));
		al.add(new Employee(104, "sameer", 40000));
		//sort list in ascending order of id's using sort method and Comparable
		Collections.sort(al);
	      System.out.println(al);
	}
}

