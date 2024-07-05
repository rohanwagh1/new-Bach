package que69;

class Employee implements Comparable<Employee> {
	   int id;
	   String name;
	   int sal;

	   public Employee(int id, String name, int sal) {
	      this.id = id;
	      this.name = name;
	      this.sal = sal;
	   }

	   public String toString() {
	      return this.id + this.name + " " + this.sal;
	   }

	   public int compareTo(Employee em) {
	      if (this.id > em.id) {
	         return 1;
	      } else {
	         return this.id < em.id ? -1 : 0;
	      }
	   }
	}
