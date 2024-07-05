package que73;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(5);
		al.add(16);
		al.add(7);
		al.add(16);
                  //remove duplicates from list and display (insertion order should not change)
		LinkedHashSet<Integer> ls= new LinkedHashSet<>(al);
		System.out.println(ls);
//		TreeSet<Integer> t=new TreeSet<>(al);
//		al.clear();
//		al.addAll(t);
//		System.out.println(t);
//		
//		ArrayList<Integer> a=new ArrayList<>(al);
//		al.clear();
//		al.addAll(a);
//		System.out.println(a);
//		
//		
	}
}

