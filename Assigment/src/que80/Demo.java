package que80;

import java.util.HashSet;



public class Demo {
public static void main(String[] args) {  
	HashSet<Employee> h=new HashSet<>();
	h.add(new Employee(102, "ram", 2000));
	h.add(new Employee(103, "shyam", 3000));
	h.add(new Employee(102, "ram", 2000));
	
	System.out.println(h);
}
}
