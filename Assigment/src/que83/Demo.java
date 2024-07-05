package que83;

import java.util.HashMap;

import que46.Employee;

//83. Create HashMap<Employee,Integer> and data into it. Make sure duplicate keys are not added.
public class Demo {
public static void main(String[] args) {
	HashMap<String, Integer> h=new HashMap<>();
	h.put("Raj", 100);
	h.put("Ram", 400);
	h.put("Tejas", 300);
	h.put("Shubham", 200);
	h.put("Shubham", 200);
	System.out.println(h);

}
}
