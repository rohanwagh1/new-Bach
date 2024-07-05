package que60;

import java.util.ArrayList;

public class Test{
public static void main(String[] args) {
	

//create five Integer objects here
//add those objects in ArrayList
//display object data from ArrayList using for loop
	Integer I1=new Integer(10);
	Integer I2=new Integer(20);
	Integer I3=new Integer(30);
	Integer I4=new Integer(40);
	Integer I5=new Integer(50);
	ArrayList<Integer> a=new ArrayList<>();
	a.add(I1);
	a.add(I2);
	a.add(I3);
	a.add(I4);
	a.add(I5);
			System.out.println(a);

	

for(int x:a){	
	System.out.println(x);
}
	
	
}
}

