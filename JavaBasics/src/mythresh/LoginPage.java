package mythresh;
import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User name :");
		String UserName = sc.nextLine();
		System.out.println("Enter Password");
		String Password = sc.nextLine();
		if (UserName.equals("Mythresh") && Password.equals("Mythre$h108")) {
			System.out.println("Welcome");
		} 
		else {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Reattempt time :" + i);
				System.out.println("Please Try Again!");
				System.out.println("Enter User name :");
				String UserName1 = sc.nextLine();
				System.out.println("Enter Password");
				String Password1 = sc.nextLine();
				if (UserName1.equals("Mythresh") && Password1.equals("Mythre$h108")) {
					System.out.println("Welcome");
					break;
				} else {
					System.out.println("Contact Admin");
				}
			}

		}
		sc.close();
	}

}