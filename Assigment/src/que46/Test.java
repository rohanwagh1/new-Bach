package que46;
//46. Create tightly encapsulated  Employee class

public class Test extends Employee {
	public void m2() {
		int salary = 10000;
		System.out.println("salary:- " + salary);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
	}
}
