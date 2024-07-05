package que61;

public class Employee {
int id;
String name;
int sal;
Employee(int id, String name, int sal){
	this.id=id;
	this.name=name;
	this.sal=sal;
}
Employee(){
	
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+sal;
	}
}
