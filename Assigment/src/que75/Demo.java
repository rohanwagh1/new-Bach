package que75;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(5);
		al.add(16);
		al.add(7);
		al.add(16);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(100);
		al1.add(7);
		al1.add(5);
		al1.add(56);
		al1.add(17);
		al1.add(26);
		//create a third arrayList al2 which should be a combination of both al and al1. al2 should contain unique value.
		ArrayList<Integer> al2= new ArrayList<>();
		al.addAll(al1);
		
		LinkedHashSet<Integer> l=new LinkedHashSet<>(al);
		al.clear();
		al.addAll(l);
		System.out.println(l);
		
	}
}

