package que51;

interface SimCard {

	void sms();

	void call();
}

class Test implements SimCard {
	public void sms() {
		System.out.println("sms is created");
	}

	public void call() {
		System.out.println("plz call ");
	}
}

class Demo {
	public static void main(String[] args) {

		Test t = new Test();
		t.sms();
		t.call();
		// implement SimCard in Test class and override methods
		// call those methods from here
	}
}
