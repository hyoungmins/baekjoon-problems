import java.util.Scanner;

public class Problem10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		int multi = a * b;
		int quotient = a / b;
		int remainder = a % b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(quotient);
		System.out.println(remainder);
		
		sc.close();
	}
}