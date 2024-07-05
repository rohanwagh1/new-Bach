package que66;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		//sort  list in descending order (use reverse function)
		Collections.reverse(al);
		System.out.println(al);
	}
}
