package que47;

public class Test extends Demo {
public void m2(){
	System.out.println("child class");
}
public static void main(String[] args) {
	Test t= new Test();
	t.m2();
	
	Demo d=new Test();
	d.m1();            // 
	
	
}
}
