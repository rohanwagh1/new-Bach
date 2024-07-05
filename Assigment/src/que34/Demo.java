package que34;

import java.util.Scanner;

public class Demo {
	int id;
	String name;
	int sal;

	public static void main(String[] args) {
		// take data id,name,salary from user using scanner and display that
		// data in show method\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id here");
		int id = sc.nextInt();
		System.out.println("Enter name here");
		String name = sc.next();
		System.out.println("Enter salary here");
		int sal = sc.nextInt();
		Demo d = new Demo();
		d.id = id;
		d.name = name;
		d.sal = sal;
		d.show(d);

	}

	public void show(Demo d){
		//display data here by doing required changes
		System.out.println("id:- "+d.id+"Name:- "+" sal:- "+d.sal);
	}
}
