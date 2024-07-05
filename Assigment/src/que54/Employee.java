package que54;

//Create Employee object and print its hashcode
public class Employee {
	int a = 10;

	public void add() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.hashCode());
	}
}
