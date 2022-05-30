package mythresh;

class Account {
	float deposite = 5000;

	public float get_total_amt() {
		return deposite;
	}
}

class Saving extends Account {
	private int fixed_deposite;

	public int getFixed_deposite() {
		return fixed_deposite;
	}

	public void setFixed_deposite(int fixed_deposite) {
		this.fixed_deposite = fixed_deposite;
	}

	@Override
	public float get_total_amt() {
		return deposite + fixed_deposite;
	}
}

class Current extends Account {
	private int credit_cash;

	public int getCredit_cash() {
		return credit_cash;
	}

	public void setCredit_cash(int credit_cash) {
		this.credit_cash = credit_cash;
	}

	@Override
	public float get_total_amt() {
		return deposite + credit_cash;
	}
}

public class Bank {
	public static void main(String[] args) {
		Current c = new Current();
		Saving s = new Saving();
		c.setCredit_cash(35000);
		System.out.println("Total Amount in CurrentAccount :" + c.get_total_amt());
		s.setFixed_deposite(15000);
		System.out.println("Total Amount in SavingAccount :" + s.get_total_amt());
		System.out.println("Total Amount in Bank :" + (c.get_total_amt() + s.get_total_amt()));
	}
}
