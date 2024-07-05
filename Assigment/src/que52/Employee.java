package que52;

public class Employee {
private int id;
private String name;
private int salary;

public Employee(int id, String name,int salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public void setid(int id){
	this.id=id;
}
public int getid(){
	return id;
}
public void setname(String name){
	this.name=name;
}
public String getname(){
	return name;
}
public void setsalary(int salary){
	this.salary=salary;
}
public int getsalary(){
	return salary;
}
public String toString(){
	return id+" "+name+" "+salary;
}
}
