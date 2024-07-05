package que29;

public class Demo {
	public static float m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {                
		//call m1 method and pass some number               // int r=33;
		                                                   // byte s=(byte)r;
		float a =Demo.m1(10);
		int b=(int)a;
		int total = 100 +b; //use returned value here;
		System.out.println(total);
}
}

