import java.util.Scanner;

public class Problem10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(fibonacci(n));

		sc.close();
	}
	
	public static int fibonacci(int n) {
		if(n<=1) {
			return n;
		} else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
	}

}
