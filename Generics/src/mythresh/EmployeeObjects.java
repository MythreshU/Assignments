package mythresh;

import java.util.HashSet;

class Employee {
	int Id;
	String name;
	String salary;
	String departmant;

	public Employee(int id, String name, String salary, String departmant) {
		super();
		Id = id;
		this.name = name;
		this.salary = salary;
		this.departmant = departmant;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + ", departmant=" + departmant + "]";
	}
}

public class EmployeeObjects {
	public static void main(String[] args) {
		HashSet<Employee> hSet = new HashSet<Employee>();
		hSet.add(new Employee(1, "name1", "25000", "dept1"));
		hSet.add(new Employee(2, "name2", "23000", "dept2"));
		hSet.add(new Employee(3, "name3", "20000", "dept3"));	
		for(Employee e : hSet) {
			System.out.println(e);
		}
	}
}
