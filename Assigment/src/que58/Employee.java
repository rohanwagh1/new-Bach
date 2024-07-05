package que58;
//Create an employee object with some data and create a clone of it and display data from the cloned object.
public class Employee implements Cloneable{
	int a;
	public static void main(String[] args)throws Exception {
		Employee e=new Employee();
		e.a=100;
		Employee e1=(Employee) e.clone();
		System.out.println(e.a);
		System.out.println(e1.a);
	}

}
