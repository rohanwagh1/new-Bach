package que36;

//Find the output
public class Demo {
	static int total = 0;

	public static void add() {
		total = 10 + 30;  // output is 40 Beacus in this total not initilaztion 
	}

	public static void main(String[] args) {
		Demo.add();
		System.out.println(total);
	}
}

