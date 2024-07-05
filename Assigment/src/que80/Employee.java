package que80;

import java.util.Objects;


public class Employee {
int id;
String name;
int sal;
public Employee(int id,String name, int sal){
	this.id=id;
	this.name=name;
	this.sal=sal;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+""+name+""+sal;
	}

@Override
public int hashCode() { // here override the all method beacuse it is custom
						// class i.e all method are override 
	return Objects.hash(id, name, sal);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Employee other = (Employee) obj;
	return id == other.id && Objects.equals(name, other.name) && sal == other.sal;
}
}

