package que67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		//sort list in descending order using Comparator
		
		Collections.sort(al,new MyComp());
		System.out.println(al);
		//TreeSet<Integer> h=new TreeSet<>(al);
		//al.clear();
		//al.addAll(h);
		
		//System.out.println(al);
	}
}
class MyComp implements Comparator<Integer>{   //it is used our Comparator method
	@Override
	public int compare(  Integer n ,Integer  o) {
		if(n<o)
			return -1;
		if(n>o)
			return 1;
		
		return 0;
	}
}