package que68;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(7);
		al.add(9);
		//sort list in ascending order using Comparator
		Collections.sort(al, new MyComp());
		System.out.println(al);
	}
}
class MyComp implements Comparator<Integer>{   //it is used our Comparator method
	@Override
	public int compare(  Integer n ,Integer  o) {
		if(n<o)
			return 1;
		if(n>o)
			return -1;
		
		return 0;
	}
}

