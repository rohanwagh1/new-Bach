package que11;

//In below example ,try to call show method in different ways which explains different ways to call static methods
public class Demo {
	public static void main(String[] args) {
		//call show method in different ways
		
		Demo.show();// By using class name it is good way to call method beaus the are use call the staic method in differnt class 
		              //we eay access
		//By using Object Create
		Demo d=new Demo();
		d.show();  // it also use but extra memory allocte 
		
		//Dircty call
		show();  // it also work but it is not good way 
	}
	public static void show(){
		System.out.println("show method");
	}
}
