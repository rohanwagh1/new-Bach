package que59;
//Write a program which will explain finalize method
public class Demo {
int a;
public static void main(String[] args) {
	Demo d=new Demo();
	d.a=100;
	//
	
	d=null;
	System.gc();
	System.out.println("finsh");
}
protected void finalize() throws Throwable{
	System.out.println("Connection closing logic");
}
}
