package mythresh;
import java.util.Scanner;

public class ArmStrongRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upperlimit: ");
		int UL = sc.nextInt();
		System.out.println("Enter the Lowerlimit: ");
		int LL = sc.nextInt();
		for (int i = UL; i <= LL; i++) {
			int n = i;
			int r = 0;
			int res = 0;

			while (n > 0) {
				r = n % 10;
				res += (r*r*r);
				n = n / 10;
			}
			if (i == res) {
				System.out.println(i + " is Armstrong number");
			}
		}sc.close();
	}
}