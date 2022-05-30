package mythresh;

class Employee {
	int basic = 18000;

	public void total_salary() {
		System.out.println("");
	}
}

class Manager extends Employee {
	private int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public void total_salary() {
		System.out.println("Total salary of Manager :" + (basic + incentive));
	}
}

class Labor extends Employee {
	private int over_time;

	public int getOver_time() {
		return over_time;
	}

	public void setOver_time(int over_time) {
		this.over_time = over_time;
	}

	public void total_salary() {
		System.out.println("Total salary of Labor :" + (basic + over_time));
	}

}

public class Organization {
	public static void main(String[] args) {
		Manager mg = new Manager();
		Labor l = new Labor();
		mg.setIncentive(4000);
		mg.total_salary();
		l.setOver_time(2000);
		l.total_salary();
	}
}
