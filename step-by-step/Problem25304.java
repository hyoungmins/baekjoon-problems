import java.util.Scanner;

public class Problem25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalAmount= sc.nextInt();
		int n = sc.nextInt();
		int eachPrice = 0;
		int sum = 0;
		
		for(int i = 0 ; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			eachPrice = a * b;
			sum += eachPrice;
		}
		
		if(totalAmount == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}
}