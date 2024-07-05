package que50;
//50. Create one interface with two abstract methods and implement those methods in one class and call them.
public class Test implements Demo {

	public void add(){
		System.out.println("hii");
	}
	public int sub(){
		int a=10;
		System.out.println("hello");
		return a;
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.add();
		int x=t.sub();
		System.out.println(x);
	}
}
