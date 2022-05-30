package mythresh;

import java.util.TreeSet;

class Employee{
	int Id;
	String Name;
	String Department;
	int age;
	public Employee(int id, String name, String department, int age) {
		this.Id = id;
		this.Name = name;
		this.Department = department;
		this.age = age;
	}
	@Override
	public String toString() {
		return Id +" " + Name + " " + Department + " " + age;
	}
	
}

public class Main {
	public static void main(String[] args) {
		TreeSet<Employee> tset = new TreeSet<Employee>();
		tset.add(new Employee(1,"Ajay","dept1",35));
		tset.add(new Employee(2,"sneha","dept2",30));
		tset.add(new Employee(3,"simran","dept3",32));
		tset.add(new Employee(4,"mahesh","dept4",28));
		tset.add(new Employee(5,"balu","dept5",29));
		tset.add(new Employee(6,"aravind","dept6",25));
		tset.add(new Employee(7,"sai","dept7",23));
		tset.add(new Employee(8,"ramesh","dept8",29));
		tset.add(new Employee(9,"suresh","dept9",31));
		tset.add(new Employee(10,"lavanya","dept10",26));
		
	}	
}
