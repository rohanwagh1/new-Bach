package que76;

class Employee {
	   int id;
	   String name;
	   int sal;

	   public Employee(int id, String name, int sal) {
	      this.id = id;
	      this.name = name;
	      this.sal = sal;
	   }

	   public String toString() {
	      return String.valueOf(this.id);
	   }
	}
