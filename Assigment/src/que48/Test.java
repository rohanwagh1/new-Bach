package que48;

public class Test extends Demo,Demo1
{

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();   //java dose not support multiple inheritans beause there ambugity problem
	}            // here two m1 method then it is confuse which method call
}
