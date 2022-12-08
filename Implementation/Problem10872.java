import java.util.Scanner;

public class Problem10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(factorial(n));
		
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n<=1) {
			return n;
		} else {
			return factorial(n-1) * n;
		}
	}

}
