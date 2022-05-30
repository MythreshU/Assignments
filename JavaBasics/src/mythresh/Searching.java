package mythresh;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Searching {

	public static void main(String[] args) throws Exception {
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a any Number: ");
		int ToFind = Integer.parseInt(br.readLine());
		boolean found = false;
		for(int n:arr) {
			if(n==ToFind) {
				found = true;
				break;
			}
			
		}
		if(found) {
			System.out.println(ToFind+" Number is present in Given List");
		}
		else {
			System.out.println(ToFind+" Number is Not present in Given List");
		}
	

	}
}