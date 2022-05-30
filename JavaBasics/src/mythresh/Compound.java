package mythresh;
import java.util.Scanner;

public class Compound {
	public static void main(String argu[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principal: ");
		double principal = sc.nextDouble();
		System.out.print("Enter the rate: ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time: ");
		double time = sc.nextDouble();

		double interest = (principal * time * rate) / 100;

		System.out.println("Principal: " + principal);
		System.out.println("Interest Rate: " + rate);
		System.out.println("Time Duration: " + time);
		System.out.println("Simple Interest: " + interest);

		sc.close();
	}
}