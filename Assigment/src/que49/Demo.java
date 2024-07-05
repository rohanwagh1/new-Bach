package que49;

class Test {
	public void add() {
		System.out.println("hii");
	}
}

class Test1 extends Test {
	public void add() {
		System.out.println("hello");
	}
}

public class Demo {

	public static void main(String[] args) {
		// create one method in class Test
		// override that method in Test1 class
		// call that overridden method from here
		// to do this thing do required changes in all these three classes

		Test t = new Test();
		t.add();
		Test1 t1 = new Test1();
		t1.add();
	}

}
