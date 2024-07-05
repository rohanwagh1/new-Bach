package que55;

//Create two employee objects with same data and compare two object(data)
public class Employee {
	int x = 100;
	int y = 100;

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee();

		System.out.println(e == e1); // ==(Opretor)= is used to error
		System.out.println(e.equals(e1)); // it is the refrance varible & show
											// refrane
	}

}
