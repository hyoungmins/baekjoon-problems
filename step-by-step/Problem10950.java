import java.util.Scanner;

public class Problem10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
		int[] sumArr = new int[T];
		
		for(int i = 0 ; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sumArr[i] = a + b;
		}
		
		for(int i : sumArr) {
			System.out.println(i);
		}
		
		sc.close();
	}
}