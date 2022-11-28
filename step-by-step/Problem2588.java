import java.util.Scanner;

public class Problem2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int firstLine = a * (b % 10);
		int secondLine = a * ((b / 10) % 10);
		int thirdLine = a * ((b / 100) % 10);
		int fourthLine = a * b;
		
		System.out.println(firstLine);
		System.out.println(secondLine);
		System.out.println(thirdLine);
		System.out.println(fourthLine);

		sc.close();
	}
}